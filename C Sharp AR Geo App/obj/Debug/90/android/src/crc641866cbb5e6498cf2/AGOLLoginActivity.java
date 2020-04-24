package crc641866cbb5e6498cf2;


public class AGOLLoginActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("C_Sharp_AR_Geo_App.AGOLLoginActivity, C Sharp AR Geo App", AGOLLoginActivity.class, __md_methods);
	}


	public AGOLLoginActivity ()
	{
		super ();
		if (getClass () == AGOLLoginActivity.class)
			mono.android.TypeManager.Activate ("C_Sharp_AR_Geo_App.AGOLLoginActivity, C Sharp AR Geo App", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
