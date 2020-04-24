package crc6431f9e275bc71ecf1;


public class ARSceneViewRenderer
	extends crc64e880f74b0c0a6082.SceneViewRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.ARToolkit.Forms.Platform.Android.ARSceneViewRenderer, Esri.ArcGISRuntime.ARToolkit.Forms", ARSceneViewRenderer.class, __md_methods);
	}


	public ARSceneViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ARSceneViewRenderer.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.ARToolkit.Forms.Platform.Android.ARSceneViewRenderer, Esri.ArcGISRuntime.ARToolkit.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ARSceneViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ARSceneViewRenderer.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.ARToolkit.Forms.Platform.Android.ARSceneViewRenderer, Esri.ArcGISRuntime.ARToolkit.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ARSceneViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ARSceneViewRenderer.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.ARToolkit.Forms.Platform.Android.ARSceneViewRenderer, Esri.ArcGISRuntime.ARToolkit.Forms", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
