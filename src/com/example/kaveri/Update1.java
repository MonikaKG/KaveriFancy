package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Update1 extends Activity{
	EditText ed1;
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.updatepage);
	        ed1=(EditText)findViewById(R.id.editText1);
	        bt=(Button)findViewById(R.id.button1);
	        bt.setOnClickListener(new View.OnClickListener() {
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		String name=ed1.getText().toString();
		      		Intent intent=new Intent(getApplicationContext(),Update2.class);
	    	    	intent.putExtra("email",name);
	    	    	startActivity(intent);		      		 
		      	   }
		        });

}
}
