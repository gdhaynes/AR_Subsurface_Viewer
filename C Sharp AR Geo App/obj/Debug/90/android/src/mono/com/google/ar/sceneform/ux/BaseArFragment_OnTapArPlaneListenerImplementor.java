package mono.com.google.ar.sceneform.ux;


public class BaseArFragment_OnTapArPlaneListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.ux.BaseArFragment.OnTapArPlaneListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTapPlane:(Lcom/google/ar/core/HitResult;Lcom/google/ar/core/Plane;Landroid/view/MotionEvent;)V:GetOnTapPlane_Lcom_google_ar_core_HitResult_Lcom_google_ar_core_Plane_Landroid_view_MotionEvent_Handler:Google.AR.Sceneform.UX.BaseArFragment/IOnTapArPlaneListenerInvoker, Xamarin.Android.SceneForm.UX\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.UX.BaseArFragment+IOnTapArPlaneListenerImplementor, Xamarin.Android.SceneForm.UX", BaseArFragment_OnTapArPlaneListenerImplementor.class, __md_methods);
	}


	public BaseArFragment_OnTapArPlaneListenerImplementor ()
	{
		super ();
		if (getClass () == BaseArFragment_OnTapArPlaneListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.UX.BaseArFragment+IOnTapArPlaneListenerImplementor, Xamarin.Android.SceneForm.UX", "", this, new java.lang.Object[] {  });
	}


	public void onTapPlane (com.google.ar.core.HitResult p0, com.google.ar.core.Plane p1, android.view.MotionEvent p2)
	{
		n_onTapPlane (p0, p1, p2);
	}

	private native void n_onTapPlane (com.google.ar.core.HitResult p0, com.google.ar.core.Plane p1, android.view.MotionEvent p2);

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
