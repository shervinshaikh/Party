package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;
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
	ArrayList<Party> parties;
	
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
	    GeoPoint iv = new GeoPoint(34411628, -119855958);
	    mapController.animateTo(iv);
	    mapController.setZoom(16);
	    
	    //getParties();
	    //setNodes();
	    setTestNode();
	    


	}
	public void getParties(){
		GetParties pull = new GetParties();
		parties = pull.getParties();
		
	}
	
	public void setNodes(){
		for (Party party : parties){
			GeoPoint node = new GeoPoint(party.getCoords()[0],party.getCoords()[1]);
			OverlayItem overlayitem = new OverlayItem(node,party.getTitle(),party.returnInfo());
			itemizedoverlay.addOverlay(overlayitem);
		    mapOverlays.add(itemizedoverlay);
		}
	}
	
	
	public void setTestNode(){   
	    //34413725, -119841313 are the coords for csil ( * 10 ^ 6)
	    GeoPoint point = new GeoPoint(34413725,-119841313);
	    OverlayItem overlayitem = new OverlayItem(point, "Harold Frank Hall","There ain't no"
	    		+ " party like a CSIL party");
	    
	    itemizedoverlay.addOverlay(overlayitem);
	    mapOverlays.add(itemizedoverlay);
	    
	    
	    
	}


}
