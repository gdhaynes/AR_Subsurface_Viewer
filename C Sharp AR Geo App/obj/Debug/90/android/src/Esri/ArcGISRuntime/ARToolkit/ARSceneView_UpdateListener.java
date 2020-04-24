package Esri.ArcGISRuntime.ARToolkit;


public class ARSceneView_UpdateListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Scene.OnUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUpdate:(Lcom/google/ar/sceneform/FrameTime;)V:GetOnUpdate_Lcom_google_ar_sceneform_FrameTime_Handler:Google.AR.Sceneform.Scene/IOnUpdateListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.ARToolkit.ARSceneView+UpdateListener, Esri.ArcGISRuntime.ARToolkit", ARSceneView_UpdateListener.class, __md_methods);
	}


	public ARSceneView_UpdateListener ()
	{
		super ();
		if (getClass () == ARSceneView_UpdateListener.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.ARToolkit.ARSceneView+UpdateListener, Esri.ArcGISRuntime.ARToolkit", "", this, new java.lang.Object[] {  });
	}


	public void onUpdate (com.google.ar.sceneform.FrameTime p0)
	{
		n_onUpdate (p0);
	}

	private native void n_onUpdate (com.google.ar.sceneform.FrameTime p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
