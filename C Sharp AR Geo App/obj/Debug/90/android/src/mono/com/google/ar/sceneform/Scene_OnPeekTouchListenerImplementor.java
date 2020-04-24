package mono.com.google.ar.sceneform;


public class Scene_OnPeekTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Scene.OnPeekTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPeekTouch:(Lcom/google/ar/sceneform/HitTestResult;Landroid/view/MotionEvent;)V:GetOnPeekTouch_Lcom_google_ar_sceneform_HitTestResult_Landroid_view_MotionEvent_Handler:Google.AR.Sceneform.Scene/IOnPeekTouchListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Scene+IOnPeekTouchListenerImplementor, Xamarin.Android.SceneForm.Core", Scene_OnPeekTouchListenerImplementor.class, __md_methods);
	}


	public Scene_OnPeekTouchListenerImplementor ()
	{
		super ();
		if (getClass () == Scene_OnPeekTouchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Scene+IOnPeekTouchListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPeekTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1)
	{
		n_onPeekTouch (p0, p1);
	}

	private native void n_onPeekTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1);

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
