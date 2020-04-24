package crc64541153ab718edadb;


public class ModelRenderableConsumer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.util.function.Consumer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_accept:(Ljava/lang/Object;)V:GetAccept_Ljava_lang_Object_Handler:Java.Util.Functions.IConsumerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Google.AR.Sceneform.Rendering.ModelRenderableConsumer, Xamarin.Android.SceneForm.Rendering", ModelRenderableConsumer.class, __md_methods);
	}


	public ModelRenderableConsumer ()
	{
		super ();
		if (getClass () == ModelRenderableConsumer.class)
			mono.android.TypeManager.Activate ("Google.AR.Sceneform.Rendering.ModelRenderableConsumer, Xamarin.Android.SceneForm.Rendering", "", this, new java.lang.Object[] {  });
	}


	public void accept (java.lang.Object p0)
	{
		n_accept (p0);
	}

	private native void n_accept (java.lang.Object p0);

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
