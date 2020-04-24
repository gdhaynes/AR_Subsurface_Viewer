package mono.com.google.ar.sceneform;


public class Scene_OnUpdateListenerImplementor
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
		mono.android.Runtime.register ("Google.AR.Sceneform.Scene+IOnUpdateListenerImplementor, Xamarin.Android.SceneForm.Core", Scene_OnUpdateListenerImplementor.class, __md_methods);
	}


	public Scene_OnUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == Scene_OnUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Scene+IOnUpdateListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
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
