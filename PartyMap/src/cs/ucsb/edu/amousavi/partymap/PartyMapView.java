package cs.ucsb.edu.amousavi.partymap;

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

	MapView mapView;
	List<Overlay> mapOverlays;
	Drawable drawable;
	MapObjects itemizedoverlay;
	MapController mapController;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.map);
	    mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    
	    mapOverlays = mapView.getOverlays();
	    drawable = this.getResources().getDrawable(android.R.drawable.btn_star);
	    itemizedoverlay = new MapObjects(drawable,this);
	    mapController = mapView.getController();
	    
	    //getParties();
	    setNodes();
	    


	}
	public void setNodes(){   
	    //34413725, -119841313 are the coords for csil ( * 10 ^ 6)
	    GeoPoint point = new GeoPoint(34413725,-119841313);
	    OverlayItem overlayitem = new OverlayItem(point, "Harold Frank Hall","CSIL \n whatever \n" +
	    		"another comment \n" +
	    		"final comment \n");
	    
	    itemizedoverlay.addOverlay(overlayitem);
	    mapOverlays.add(itemizedoverlay);
	    
	    
	    mapController.animateTo(point);
	    mapController.setZoom(15);
	}


}
