package mono.com.google.ar.sceneform.rendering;


public class LoadGltfListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ar.sceneform.rendering.LoadGltfListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFinishedLoadingModel:(J)V:GetOnFinishedLoadingModel_JHandler:Google.AR.Sceneform.Rendering.ILoadGltfListenerInvoker, Xamarin.Android.SceneForm.Rendering\n" +
			"n_onFinishedReadingFiles:(J)V:GetOnFinishedReadingFiles_JHandler:Google.AR.Sceneform.Rendering.ILoadGltfListenerInvoker, Xamarin.Android.SceneForm.Rendering\n" +
			"n_onReadingFilesFailed:(Ljava/lang/Exception;)V:GetOnReadingFilesFailed_Ljava_lang_Exception_Handler:Google.AR.Sceneform.Rendering.ILoadGltfListenerInvoker, Xamarin.Android.SceneForm.Rendering\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Rendering.ILoadGltfListenerImplementor, Xamarin.Android.SceneForm.Rendering", LoadGltfListenerImplementor.class, __md_methods);
	}


	public LoadGltfListenerImplementor ()
	{
		super ();
		if (getClass () == LoadGltfListenerImplementor.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Rendering.ILoadGltfListenerImplementor, Xamarin.Android.SceneForm.Rendering", "", this, new java.lang.Object[] {  });
	}


	public void onFinishedLoadingModel (long p0)
	{
		n_onFinishedLoadingModel (p0);
	}

	private native void n_onFinishedLoadingModel (long p0);


	public void onFinishedReadingFiles (long p0)
	{
		n_onFinishedReadingFiles (p0);
	}

	private native void n_onFinishedReadingFiles (long p0);


	public void onReadingFilesFailed (java.lang.Exception p0)
	{
		n_onReadingFilesFailed (p0);
	}

	private native void n_onReadingFilesFailed (java.lang.Exception p0);

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
