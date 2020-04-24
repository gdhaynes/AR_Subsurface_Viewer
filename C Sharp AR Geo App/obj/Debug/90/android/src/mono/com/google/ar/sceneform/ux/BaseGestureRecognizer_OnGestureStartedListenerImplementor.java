package mono.com.google.ar.sceneform.ux;


public class BaseGestureRecognizer_OnGestureStartedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.ux.BaseGestureRecognizer.OnGestureStartedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGestureStarted:(Lcom/google/ar/sceneform/ux/BaseGesture;)V:GetOnGestureStarted_Lcom_google_ar_sceneform_ux_BaseGesture_Handler:Google.AR.Sceneform.UX.BaseGestureRecognizer/IOnGestureStartedListenerInvoker, Xamarin.Android.SceneForm.UX\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.UX.BaseGestureRecognizer+IOnGestureStartedListenerImplementor, Xamarin.Android.SceneForm.UX", BaseGestureRecognizer_OnGestureStartedListenerImplementor.class, __md_methods);
	}


	public BaseGestureRecognizer_OnGestureStartedListenerImplementor ()
	{
		super ();
		if (getClass () == BaseGestureRecognizer_OnGestureStartedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.UX.BaseGestureRecognizer+IOnGestureStartedListenerImplementor, Xamarin.Android.SceneForm.UX", "", this, new java.lang.Object[] {  });
	}


	public void onGestureStarted (com.google.ar.sceneform.ux.BaseGesture p0)
	{
		n_onGestureStarted (p0);
	}

	private native void n_onGestureStarted (com.google.ar.sceneform.ux.BaseGesture p0);

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
