package cs.ucsb.edu.amousavi.partymap;
//test
import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.*;


import com.google.android.maps.*;

public class PartyMapView extends MapActivity {

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.map);
	    MapView mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    
	    List<Overlay> mapOverlays = mapView.getOverlays();
	    Drawable drawable = this.getResources().getDrawable(android.R.drawable.btn_star);
	    MapObjects itemizedoverlay = new MapObjects(drawable,this);
	    
	    
	    //34413725, -119841313 are the coords for csil ( * 10 ^ 6)
	    GeoPoint point = new GeoPoint(34413725,-119841313);
	    OverlayItem overlayitem = new OverlayItem(point, "Harold Frank Hall","CSIL");
	    
	    itemizedoverlay.addOverlay(overlayitem);
	    mapOverlays.add(itemizedoverlay);
	    
	    MapController mapController = mapView.getController();
	    mapController.animateTo(point);
	    mapController.setZoom(10);

	}


}
