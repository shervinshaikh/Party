package cs.ucsb.edu.amousavi.partymap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NodeMod extends Activity implements OnClickListener {


	public void onClick(View arg0) {
		EditText ratingBox = new EditText(this);
		ratingBox=(EditText)findViewById(R.id.editText1);
		String sRating = ratingBox.getText().toString();
		int rating;
		if(sRating == "1" ||sRating == "2"||sRating == "3"||sRating =="4"||sRating =="5")
				rating = Integer.parseInt(sRating);
		else
			rating = 0;
		
		EditText commentBox = new EditText(this);
		commentBox=(EditText)findViewById(R.id.editText2);
		String comment = commentBox.getText().toString();
		
		//so now comment and rating have values to be passed to the server
		//do stuff to pass to the server
		
		finish();
		
	}

	String editTitle;
	
	Button submit;
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        editTitle = b.getString("title");
        setContentView(R.layout.nodeedit);
        
        TextView t=new TextView(this); 
        t=(TextView)findViewById(R.id.textView2); 
        t.setText(editTitle);
        
        
        
        submit = (Button)findViewById(R.id.edit_party_button); 
        submit.setOnClickListener(this);
        
	}
}
