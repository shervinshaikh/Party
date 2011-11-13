package cs.ucsb.edu.amousavi.partymap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;

public class GetLocationTap extends Overlay {
	
	
	//private GeoPoint coords;
	
	private int [] coords;
	
	private Context context;
	
	public GetLocationTap(Context context){
		this.context = context;
		
	}
	
	public boolean onTap(GeoPoint p,MapView mapview){
		coords = new int[2];
		coords[0] = p.getLongitudeE6();
		coords[1] = p.getLatitudeE6();
		Intent spawner = new Intent(context,NodeSpawn.class);
		spawner.putExtra("coords",coords);
		context.startActivity(spawner);
		((Activity) context).finish();
		
		//start new activity to create party
		
		return true;
	}
	
	public int [] getCoords(){
		return coords;
	}
	
	
	
}
