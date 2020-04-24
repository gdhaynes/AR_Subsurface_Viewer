package crc649dc7e63e363e96dd;


public class BookmarkItemViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Esri.ArcGISRuntime.Toolkit.UI.Controls.BookmarkItemViewHolder, Esri.ArcGISRuntime.Toolkit", BookmarkItemViewHolder.class, __md_methods);
	}


	public BookmarkItemViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == BookmarkItemViewHolder.class)
			mono.android.TypeManager.Activate ("Esri.ArcGISRuntime.Toolkit.UI.Controls.BookmarkItemViewHolder, Esri.ArcGISRuntime.Toolkit", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
