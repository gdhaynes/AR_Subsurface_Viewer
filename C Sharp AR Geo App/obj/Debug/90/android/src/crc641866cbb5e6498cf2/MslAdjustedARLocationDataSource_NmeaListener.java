package crc641866cbb5e6498cf2;


public class MslAdjustedARLocationDataSource_NmeaListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.location.OnNmeaMessageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNmeaMessage:(Ljava/lang/String;J)V:GetOnNmeaMessage_Ljava_lang_String_JHandler:Android.Locations.IOnNmeaMessageListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("C_Sharp_AR_Geo_App.MslAdjustedARLocationDataSource+NmeaListener, C Sharp AR Geo App", MslAdjustedARLocationDataSource_NmeaListener.class, __md_methods);
	}


	public MslAdjustedARLocationDataSource_NmeaListener ()
	{
		super ();
		if (getClass () == MslAdjustedARLocationDataSource_NmeaListener.class)
			mono.android.TypeManager.Activate ("C_Sharp_AR_Geo_App.MslAdjustedARLocationDataSource+NmeaListener, C Sharp AR Geo App", "", this, new java.lang.Object[] {  });
	}


	public void onNmeaMessage (java.lang.String p0, long p1)
	{
		n_onNmeaMessage (p0, p1);
	}

	private native void n_onNmeaMessage (java.lang.String p0, long p1);

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
