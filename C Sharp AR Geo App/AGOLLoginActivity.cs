using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Support.V7.App;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Esri.ArcGISRuntime.Security;

namespace C_Sharp_AR_Geo_App
{
    [Activity(Label = "AGOLLoginActivity", MainLauncher = true)]
    public class AGOLLoginActivity : Activity
    { 
        private string _username = string.Empty;
        private string _password = string.Empty;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.Login);

            var emptyCredentialsToast = Toast.MakeText(Application.Context, "Login success!", ToastLength.Short);

            Button AGOLLoginButton = FindViewById<Button>(Resource.Id.AGOLLoginButton);
            AGOLLoginButton.Click += (sender, e) =>
            {
                _username = FindViewById<EditText>(Resource.Id.AGOLUsername).Text;
                _password = FindViewById<EditText>(Resource.Id.AGOLPassword).Text;
                if(_username != null)
                {
                    emptyCredentialsToast.Show();
                }
                if (_password != null)
                {
                    emptyCredentialsToast.Show();
                }
                if(_username != null && _password != null)
                {
                    var intent = new Intent(this, typeof(SceneActivity));
                    intent.PutExtra("Username", _username);
                    intent.PutExtra("Password", _password);
                    StartActivity(intent);
                }
            };
        }
    }
}