package mono.com.google.ar.sceneform;


public class Node_OnTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Node.OnTapListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTap:(Lcom/google/ar/sceneform/HitTestResult;Landroid/view/MotionEvent;)V:GetOnTap_Lcom_google_ar_sceneform_HitTestResult_Landroid_view_MotionEvent_Handler:Google.AR.Sceneform.Node/IOnTapListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Node+IOnTapListenerImplementor, Xamarin.Android.SceneForm.Core", Node_OnTapListenerImplementor.class, __md_methods);
	}


	public Node_OnTapListenerImplementor ()
	{
		super ();
		if (getClass () == Node_OnTapListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Node+IOnTapListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public void onTap (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1)
	{
		n_onTap (p0, p1);
	}

	private native void n_onTap (com.google.ar.sceneform.HitTestResult p0, android.view.MotionEvent p1);

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
