using Android.App;
using Android.Support.V7.App;
using Android.Widget;
using Android.OS;
using System;
using System.Threading.Tasks;

// ESRI specific
using Esri.ArcGISRuntime.ARToolkit;
using Esri.ArcGISRuntime.Geometry;
using Esri.ArcGISRuntime.Security;
using Esri.ArcGISRuntime.Portal;
using Esri.ArcGISRuntime.Location;
using Esri.ArcGISRuntime.Mapping;
using Esri.ArcGISRuntime.UI;
using Esri.ArcGISRuntime.Symbology;
using Surface = Esri.ArcGISRuntime.Mapping.Surface;
using Esri.ArcGISRuntime.Data;
using System.Drawing;
using Android.Views;

namespace C_Sharp_AR_Geo_App
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme", MainLauncher = false)]
    public class SceneActivity : AppCompatActivity
    {
        private ARSceneView _arSceneView;
        private ArcGISPortal _portal;
        private PortalItem _envWorkingData;
        private ArcGISTiledElevationSource _elevationSource;

        private Button _calibrateButton;
        private View _calibrationView;
        private JoystickSeekBar _headingSlider;
        private JoystickSeekBar _altitudeSlider;

        // Custom location data source that enables calibration and returns
        // values relative to mean sea level rather than the WGS84 ellipsoid.
        private MslAdjustedARLocationDataSource _locationDataSource;

        //Scene content
        private Surface _elevationSurface;
        private Scene _scene;
        private FeatureLayer _wellsLayer;

        private readonly Uri baseAddress = new Uri("https://dlzcorp.maps.arcgis.com/sharing/rest");


        // Calibration state fields.
        private bool _isCalibrating;
        private double _altitudeOffset;

        private bool IsCalibrating
        {
            get => _isCalibrating;
            set
            {
                _isCalibrating = value;
                if (_isCalibrating)
                {
                    // Show the surface semitransparent for calibration.
                    _scene.BaseSurface.Opacity = 0.5;
                    _calibrationView.Visibility = ViewStates.Visible;
                }
                else
                {
                    // Hide the scene when not calibrating.
                    _scene.BaseSurface.Opacity = 0;
                    _calibrationView.Visibility = ViewStates.Gone;
                }
            }
        }


        protected async override void OnCreate(Bundle savedInstanceState)
        {
        
            base.OnCreate(savedInstanceState);

            bool loggedin = await Login(Intent.GetStringExtra("Username"), Intent.GetStringExtra("Password"));
            if(loggedin == true)
            {
                // Call CreateLayout to create the AR layout
                CreateLayout();

                // Configure the AT Scene view
                Initialize();
            }
        }

        private void AltitudeSlider_DeltaProgressChanged(object sender, DeltaChangedEventArgs e)
        {
            // Add the new value to the existing altitude offset.
            _altitudeOffset += e.DeltaProgress;

            // Update the altitude offset on the custom location data source.
            _locationDataSource.AltitudeOffset = _altitudeOffset;
        }

        private void HeadingSlider_DeltaProgressChanged(object sender, DeltaChangedEventArgs e)
        {
            // Get the old camera.
            Camera camera = _arSceneView.OriginCamera;

            // Calculate the new heading by applying the offset to the old camera's heading.
            double heading = camera.Heading + e.DeltaProgress;

            // Create a new camera by rotating the old camera to the new heading.
            Camera newCamera = camera.RotateTo(heading, camera.Pitch, camera.Roll);

            // Use the new camera as the origin camera.
            _arSceneView.OriginCamera = newCamera;
        }

        private async Task<bool> Login(string agolUsername, string agolPassword)
        {
            try
            {
                var cred = await AuthenticationManager.Current.GenerateCredentialAsync(baseAddress, agolUsername, agolPassword) as ArcGISTokenCredential;

                // Add the credential to the credential manager
                AuthenticationManager.Current.AddCredential(cred);
                //connecting to the portal will use an available credential(based on the server URL)
                _portal = await ArcGISPortal.CreateAsync(baseAddress, cred);
                _envWorkingData = await PortalItem.CreateAsync(_portal, "3b5c3568c4c240349c7f0e163b8c9d7f");
                // build a URL to the first layer in the service
                var welluri = new Uri(_envWorkingData.ServiceUrl + "/1");
                // create a new service feature table referencing the service
                var wellTable = new ServiceFeatureTable(welluri);
                // Load the wellTable
                await wellTable.LoadAsync();
                // create a new feature layer from the table if its loaded
                if (wellTable.LoadStatus == Esri.ArcGISRuntime.LoadStatus.Loaded)
                {
                    _wellsLayer = new FeatureLayer(wellTable);
                }
                return true;
            }
            catch (Exception e)
            {
                var failureToast = Toast.MakeText(Application.Context, "Login failed, please try again" + e.Message, ToastLength.Short);
                failureToast.Show();
                return false;
            }
        }

        private void CreateLayout()
        {
            SetContentView(Resource.Layout.ARScene);

            _arSceneView = FindViewById<ARSceneView>(Resource.Id.arView);

            _calibrateButton = FindViewById<Button>(Resource.Id.calibrateButton);
            _calibrationView = FindViewById(Resource.Id.calibrationView);
            _headingSlider = FindViewById<JoystickSeekBar>(Resource.Id.headingJoystick);
            _altitudeSlider = FindViewById<JoystickSeekBar>(Resource.Id.altitudeJoystick);

            // Configure calibration sliders.
            _headingSlider.DeltaProgressChanged += HeadingSlider_DeltaProgressChanged;
            _altitudeSlider.DeltaProgressChanged += AltitudeSlider_DeltaProgressChanged;

            // calibrate click event
            _calibrateButton.Click += (o, e) => IsCalibrating = !IsCalibrating;

            // Set the translation factor, 1 for world scale AR
            //_arSceneView.TranslationFactor = 1;

            // Create the custom location data source and configure the AR scene view to use it.
            _locationDataSource = new MslAdjustedARLocationDataSource(this);
            _locationDataSource.AltitudeMode = MslAdjustedARLocationDataSource.AltitudeAdjustmentMode.NmeaParsedMsl;
            _arSceneView.LocationDataSource = _locationDataSource;

            // Disable plane rendering and visualization.
            _arSceneView.ArSceneView.PlaneRenderer.Enabled = false;
            _arSceneView.ArSceneView.PlaneRenderer.Visible = false;
        }

        protected override async void OnPause()
        {
            base.OnPause();
            // Since Onpause is called when the async fires and before _arSceneview is instantiated
            // we have to check if its null to avoid an error
            if (_arSceneView != null)
            {
                await _arSceneView.StopTrackingAsync();
            }
        }

        protected override async void OnResume()
        {
            base.OnResume();
            if (_arSceneView != null)
            {
                // Continuous update mode
                await _arSceneView.StartTrackingAsync(ARLocationTrackingMode.Continuous);
            }
        }

        private void Initialize()
        {
            // Create the scene with imagery basemap
            _scene = new Scene(Basemap.CreateImagery());
            _arSceneView.Scene = _scene;

            // Create and add the elevation surface
            _elevationSource = new ArcGISTiledElevationSource(new Uri("https://elevation3d.arcgis.com/arcgis/rest/services/WorldElevation3D/Terrain3D/ImageServer"));
            _elevationSurface = new Esri.ArcGISRuntime.Mapping.Surface();
            _elevationSurface.ElevationSources.Add(_elevationSource);
            _arSceneView.Scene.BaseSurface = _elevationSurface;

            // Hide the surface in AR.
            _elevationSurface.NavigationConstraint = NavigationConstraint.None;
            _elevationSurface.Opacity = 0.5;

            // Disable space and atmosphere effects
            _arSceneView.SpaceEffect = SpaceEffect.None;
            _arSceneView.AtmosphereEffect = AtmosphereEffect.None;

            // Add Layers/graphics here
            DrawWells();
        }

        private void DrawWells()
        {
            // Set the wells Feature layer to dynmaic rendering to support extrusion
            _wellsLayer.RenderingMode = FeatureRenderingMode.Dynamic;

            SimpleMarkerSymbol pointSymbol = new SimpleMarkerSymbol(SimpleMarkerSymbolStyle.Circle, Color.Blue, 0.25);        

            SimpleRenderer wellRenderer = new SimpleRenderer(pointSymbol);

            wellRenderer.SceneProperties.ExtrusionMode = ExtrusionMode.AbsoluteHeight;

            wellRenderer.SceneProperties.ExtrusionExpression = "[Depth] * -1";

            _wellsLayer.Renderer = wellRenderer;
            _wellsLayer.SceneProperties.AltitudeOffset = 0;
            _wellsLayer.SceneProperties.SurfacePlacement = SurfacePlacement.DrapedBillboarded;
            _arSceneView.Scene.OperationalLayers.Add(_wellsLayer);
        }
    }
}