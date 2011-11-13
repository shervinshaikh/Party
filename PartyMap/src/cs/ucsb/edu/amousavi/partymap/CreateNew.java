package cs.ucsb.edu.amousavi.partymap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class CreateNew extends Activity implements OnClickListener{
    
	private Context map;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createnew);
        Button FromCurrent = (Button)findViewById(R.id.from_current); 
        FromCurrent.setOnClickListener(this);
        
        Button FromSelect = (Button)findViewById(R.id.from_select); 
        FromSelect.setOnClickListener(this);
        
        Button CancelNew = (Button)findViewById(R.id.cancel_new); 
        CancelNew.setOnClickListener(this);
        
    }

	public void onClick(View v) {
		switch(v.getId()){

		  case (R.id.from_current):
		       

		  case (R.id.from_select):
			  Intent myIntent = new Intent(this, MapSelectLocation.class);
		  	  this.startActivity(myIntent);
		  	  finish();
			  
		  case (R.id.cancel_new):
			  finish();
		  }
		
	}
}
