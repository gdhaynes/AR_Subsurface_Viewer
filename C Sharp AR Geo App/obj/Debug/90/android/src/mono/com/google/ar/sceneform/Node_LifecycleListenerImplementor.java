package mono.com.google.ar.sceneform;


public class Node_LifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Node.LifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivated:(Lcom/google/ar/sceneform/Node;)V:GetOnActivated_Lcom_google_ar_sceneform_Node_Handler:Google.AR.Sceneform.Node/ILifecycleListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"n_onDeactivated:(Lcom/google/ar/sceneform/Node;)V:GetOnDeactivated_Lcom_google_ar_sceneform_Node_Handler:Google.AR.Sceneform.Node/ILifecycleListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"n_onUpdated:(Lcom/google/ar/sceneform/Node;Lcom/google/ar/sceneform/FrameTime;)V:GetOnUpdated_Lcom_google_ar_sceneform_Node_Lcom_google_ar_sceneform_FrameTime_Handler:Google.AR.Sceneform.Node/ILifecycleListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Node+ILifecycleListenerImplementor, Xamarin.Android.SceneForm.Core", Node_LifecycleListenerImplementor.class, __md_methods);
	}


	public Node_LifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == Node_LifecycleListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Node+ILifecycleListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public void onActivated (com.google.ar.sceneform.Node p0)
	{
		n_onActivated (p0);
	}

	private native void n_onActivated (com.google.ar.sceneform.Node p0);


	public void onDeactivated (com.google.ar.sceneform.Node p0)
	{
		n_onDeactivated (p0);
	}

	private native void n_onDeactivated (com.google.ar.sceneform.Node p0);


	public void onUpdated (com.google.ar.sceneform.Node p0, com.google.ar.sceneform.FrameTime p1)
	{
		n_onUpdated (p0, p1);
	}

	private native void n_onUpdated (com.google.ar.sceneform.Node p0, com.google.ar.sceneform.FrameTime p1);

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
