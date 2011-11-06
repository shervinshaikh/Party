package cs.ucsb.edu.amousavi.partymap;

//import com.google.android.maps.MapView;
//comment again
//one more
//test 3
//push again
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class PartyMapActivity extends Activity implements OnClickListener {
    
	Button mapButton;
	//TextView myLabel;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mapButton = (Button)findViewById(R.id.button1);
        //myLabel = (TextView)findViewById(R.id.TextView01);
        
        mapButton.setOnClickListener(this);
    }

	public void onClick(View v) {
		Intent myIntent = new Intent(this, PartyMapView.class);
		startActivity(myIntent);// TODO Auto-generated method stub
		
	}
}