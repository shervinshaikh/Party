package cs.ucsb.edu.amousavi.partymap;

import java.util.ArrayList;
import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.*;
import android.view.Menu;
import android.view.MenuInflater;


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
	    parties = new ArrayList<Party>();
	    
	    getParties();
	    //getPartyStub();
	    setNodes();
	    //setTestNode();
	}
	
	public void getParties(){
		GetParties pull = new GetParties();
		parties = pull.getParties();
		
	}
	
	public void getPartyStub(){
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("this party sucks massive $!@&");
		c1.add("people doing coke everywhere");
		c1.add("theres a dead stripper in the closet!");
		int[] cd1 = new int[2];
		cd1[0] = 34409587;
		cd1[1] = -119860279;
		Party n1 = new Party(3, c1, cd1, "6643 DP");
		parties.add(n1);
	}
	
	public void setNodes(){
		
		for (Party party : parties){
			int [] coords = new int[2];
			coords = party.getCoords();
			int xcoord = coords[0];
			int ycoord = coords[1];
			GeoPoint node = new GeoPoint(xcoord,ycoord);
			OverlayItem overlayitem = new OverlayItem(node,party.getTitle(),
					party.returnInfo());
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
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.mapmenu, menu);
	    return true;
	}


}
