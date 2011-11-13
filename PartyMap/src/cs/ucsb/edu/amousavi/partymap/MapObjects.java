package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

@SuppressWarnings("rawtypes")
public class MapObjects extends ItemizedOverlay {

	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	
	private Context mContext;
	
	private boolean editToggle = false;
	
	public void toggleEdit(){
		editToggle = (!editToggle);
	}
	
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
	/*
	String editTitle;
	
	public String getEditTitle(){return editTitle;}
	*/
	
	protected boolean onTap(int index) {
		if (editToggle){
			//starts an edit node activity
			OverlayItem item = mOverlays.get(index);
			String editTitle = item.getTitle();
			
			Intent myIntent = new Intent(mContext, NodeMod.class);
			//Bundle b = new Bundle();
			//b.putString("title", editTitle);
			myIntent.putExtra("title", editTitle);
			mContext.startActivity(myIntent);
			return true;
		}
		else{
			
			
			OverlayItem item = mOverlays.get(index);
			AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
			dialog.setTitle(item.getTitle());
			dialog.setMessage(item.getSnippet());
			dialog.show();
			
			return true;
			}
		}
	


}
