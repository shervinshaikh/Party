package cs.ucsb.edu.amousavi.partymap;
//test
import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class MapObjects extends ItemizedOverlay {

	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	
	private Context mContext;
	
	public MapObjects(Drawable defaultMarker, Context context) {
		super(boundCenterBottom(defaultMarker));
		
		mContext = context;
	}
	
	public MapObjects(Drawable defaultMarker) {
		  super(defaultMarker);
		}

	@Override
	protected OverlayItem createItem(int arg0) {
		// TODO Auto-generated method stub
		return mOverlays.get(arg0);
	}

	@Override
	public int size() {
		return mOverlays.size();
	}
	
	public void addOverlay(OverlayItem overlay) {
	    mOverlays.add(overlay);
	    populate();
	}
	
	protected boolean onTap(int index) {
		  OverlayItem item = mOverlays.get(index);
		  AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
		  dialog.setTitle(item.getTitle());
		  dialog.setMessage(item.getSnippet());
		  dialog.show();
		  return true;
		}

}
