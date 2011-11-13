package cs.ucsb.edu.amousavi.partymap;

import java.util.List;

import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;

public class MapSelectLocation extends MapActivity {

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	MapView mapView;
	MapController mapController;
	int [] coords;
	GetLocationTap tapper;
	List<Overlay> mapOverlays;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		coords = new int[2];
		setContentView(R.layout.map);
	    
	    tapper = new GetLocationTap(this);
	    
	    mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    mapOverlays = mapView.getOverlays();
	    mapController = mapView.getController();
	    GeoPoint iv = new GeoPoint(34411628, -119855958);
	    mapController.animateTo(iv);
	    mapController.setZoom(16);
	    mapOverlays.add(tapper);
	    
	}
	
	
}
