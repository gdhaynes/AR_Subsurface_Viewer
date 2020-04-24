package crc641866cbb5e6498cf2;


public class JoystickSeekBar
	extends android.support.v7.widget.AppCompatSeekBar
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("C_Sharp_AR_Geo_App.JoystickSeekBar, C Sharp AR Geo App", JoystickSeekBar.class, __md_methods);
	}


	public JoystickSeekBar (android.content.Context p0)
	{
		super (p0);
		if (getClass () == JoystickSeekBar.class)
			mono.android.TypeManager.Activate ("C_Sharp_AR_Geo_App.JoystickSeekBar, C Sharp AR Geo App", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public JoystickSeekBar (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == JoystickSeekBar.class)
			mono.android.TypeManager.Activate ("C_Sharp_AR_Geo_App.JoystickSeekBar, C Sharp AR Geo App", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public JoystickSeekBar (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == JoystickSeekBar.class)
			mono.android.TypeManager.Activate ("C_Sharp_AR_Geo_App.JoystickSeekBar, C Sharp AR Geo App", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
