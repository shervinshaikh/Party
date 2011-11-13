package cs.ucsb.edu.amousavi.partymap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NodeSpawn extends Activity implements OnClickListener{

	private int [] coords;
	
	String title;
	
	public void onClick(View arg0) {
		//push coords and title to server ...
		finish();
	}
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        coords = new int[2];
        coords = b.getIntArray("coords");
        setContentView(R.layout.newparty);
        
        
        TextView tlon=new TextView(this); 
        tlon=(TextView)findViewById(R.id.lon); 
        tlon.setText(Integer.toString(coords[0]));
        
        TextView tlat=new TextView(this); 
        tlat=(TextView)findViewById(R.id.lat); 
        tlat.setText(Integer.toString(coords[1]));
        
        EditText titleBox = new EditText(this);
		titleBox=(EditText)findViewById(R.id.new_party_title);
		title = titleBox.getText().toString();
        
        Button submit=new Button(this);
        submit = (Button)findViewById(R.id.submit_party);
        submit.setOnClickListener(this);
        
        
	}
        
        
}
