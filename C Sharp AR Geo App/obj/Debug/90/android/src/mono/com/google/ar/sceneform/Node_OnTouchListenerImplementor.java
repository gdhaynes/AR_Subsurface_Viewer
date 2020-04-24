package mono.com.google.ar.sceneform;


public class Node_OnTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Node.OnTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouch:(Lcom/google/ar/sceneform/HitTestResult;Landroid/view/MotionEvent;)Z:GetOnTouch_Lcom_google_ar_sceneform_HitTestResult_Landroid_view_MotionEvent_Handler:Google.AR.Sceneform.Node/IOnTouchListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Node+IOnTouchListenerImplementor, Xamarin.Android.SceneForm.Core", Node_OnTouchListenerImplementor.class, __md_methods);
	}


	public Node_OnTouchListenerImplementor ()
	{
		super ();
		if (getClass () == Node_OnTouchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Node+IOnTouchListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public boolean onTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1);

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
