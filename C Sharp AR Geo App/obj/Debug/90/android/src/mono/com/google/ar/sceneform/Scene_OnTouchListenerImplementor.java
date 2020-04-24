package mono.com.google.ar.sceneform;


public class Scene_OnTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Scene.OnTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSceneTouch:(Lcom/google/ar/sceneform/HitTestResult;Landroid/view/MotionEvent;)Z:GetOnSceneTouch_Lcom_google_ar_sceneform_HitTestResult_Landroid_view_MotionEvent_Handler:Google.AR.Sceneform.Scene/IOnTouchListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Scene+IOnTouchListenerImplementor, Xamarin.Android.SceneForm.Core", Scene_OnTouchListenerImplementor.class, __md_methods);
	}


	public Scene_OnTouchListenerImplementor ()
	{
		super ();
		if (getClass () == Scene_OnTouchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Scene+IOnTouchListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public boolean onSceneTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1)
	{
		return n_onSceneTouch (p0, p1);
	}

	private native boolean n_onSceneTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1);

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
