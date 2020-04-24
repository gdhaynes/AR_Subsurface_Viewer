package mono.com.google.ar.sceneform.ux;


public class BaseGesture_OnGestureEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.ux.BaseGesture.OnGestureEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFinished:(Lcom/google/ar/sceneform/ux/BaseGesture;)V:GetOnFinished_Lcom_google_ar_sceneform_ux_BaseGesture_Handler:Google.AR.Sceneform.UX.BaseGesture/IOnGestureEventListenerInvoker, Xamarin.Android.SceneForm.UX\n" +
			"n_onUpdated:(Lcom/google/ar/sceneform/ux/BaseGesture;)V:GetOnUpdated_Lcom_google_ar_sceneform_ux_BaseGesture_Handler:Google.AR.Sceneform.UX.BaseGesture/IOnGestureEventListenerInvoker, Xamarin.Android.SceneForm.UX\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.UX.BaseGesture+IOnGestureEventListenerImplementor, Xamarin.Android.SceneForm.UX", BaseGesture_OnGestureEventListenerImplementor.class, __md_methods);
	}


	public BaseGesture_OnGestureEventListenerImplementor ()
	{
		super ();
		if (getClass () == BaseGesture_OnGestureEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.UX.BaseGesture+IOnGestureEventListenerImplementor, Xamarin.Android.SceneForm.UX", "", this, new java.lang.Object[] {  });
	}


	public void onFinished (com.google.ar.sceneform.ux.BaseGesture p0)
	{
		n_onFinished (p0);
	}

	private native void n_onFinished (com.google.ar.sceneform.ux.BaseGesture p0);


	public void onUpdated (com.google.ar.sceneform.ux.BaseGesture p0)
	{
		n_onUpdated (p0);
	}

	private native void n_onUpdated (com.google.ar.sceneform.ux.BaseGesture p0);

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
