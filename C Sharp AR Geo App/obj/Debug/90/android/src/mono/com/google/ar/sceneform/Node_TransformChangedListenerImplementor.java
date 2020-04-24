package mono.com.google.ar.sceneform;


public class Node_TransformChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.Node.TransformChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTransformChanged:(Lcom/google/ar/sceneform/Node;Lcom/google/ar/sceneform/Node;)V:GetOnTransformChanged_Lcom_google_ar_sceneform_Node_Lcom_google_ar_sceneform_Node_Handler:Google.AR.Sceneform.Node/ITransformChangedListenerInvoker, Xamarin.Android.SceneForm.Core\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Node+ITransformChangedListenerImplementor, Xamarin.Android.SceneForm.Core", Node_TransformChangedListenerImplementor.class, __md_methods);
	}


	public Node_TransformChangedListenerImplementor ()
	{
		super ();
		if (getClass () == Node_TransformChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Node+ITransformChangedListenerImplementor, Xamarin.Android.SceneForm.Core", "", this, new java.lang.Object[] {  });
	}


	public void onTransformChanged (com.google.ar.sceneform.Node p0, com.google.ar.sceneform.Node p1)
	{
		n_onTransformChanged (p0, p1);
	}

	private native void n_onTransformChanged (com.google.ar.sceneform.Node p0, com.google.ar.sceneform.Node p1);

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
