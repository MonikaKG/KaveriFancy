package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update2 extends Activity{
	EditText ed1,ed2;
	Button bt;
	VivzDatabaseAdapter vivzhelper;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.updatepage1);
	        ed1=(EditText)findViewById(R.id.editText1);
	        ed2=(EditText)findViewById(R.id.editText2);
	        bt=(Button)findViewById(R.id.button1);
	        vivzhelper=new VivzDatabaseAdapter(this);
	        bt.setOnClickListener(new View.OnClickListener() {
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		Intent intent =getIntent();
			        String oper=intent.getStringExtra("email");
		      		String pass=ed1.getText().toString();
		      		String repass=ed2.getText().toString();
		      		if(pass.equals(repass))
		      		{
		      			int res=vivzhelper.updatequery(oper,pass);
		    	        if(res>0)
		    	        {
		    	        	Toast.makeText(getApplicationContext(), "Updated Successfully",Toast.LENGTH_LONG).show();
		    	        	Intent intent1=new Intent(getApplicationContext(),Signin.class);
		    	        	startActivity(intent1);
		    	        }
		    	        else
			      			Toast.makeText(getApplicationContext(), "Password must be same",Toast.LENGTH_LONG).show();
		      		}
		      		else
		      			Toast.makeText(getApplicationContext(), "Password must be same",Toast.LENGTH_LONG).show();
	      		 
		      	   }
		        });

}
}
