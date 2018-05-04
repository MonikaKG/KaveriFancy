package com.example.kaveri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Purchasedes1 extends Activity
{
	Button bt;
	VivzDatabaseAdapter vivzhelper;

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.purchasedes1);
	        bt=(Button)findViewById(R.id.button1);
	        vivzhelper=new VivzDatabaseAdapter(this);
	        bt.setOnClickListener(new View.OnClickListener() 
	        {
	      	   @Override
	      	   public void onClick(View v) 
	      	   {
	      		 SharedPreferences sp = getSharedPreferences("MyPrefs",Context.MODE_PRIVATE);
		         String name="Name :"+sp.getString("Name"," ");
		         String pass="Pass :"+sp.getString("Pass"," ");
		         String[] values=name.split(":");
		         String n1=values[1];
		         String[] values1=pass.split(":");
		         String p1=values1[1];
		         String result=vivzhelper.getData(n1, p1);
		         if(result!=null)
		         {
	        	// Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();	
		         Intent in = new Intent(getApplicationContext(),MainActivity45.class);
		         in.putExtra("result",result);
			 	 startActivity(in);
		         }
		         else
		         {
		        	 Toast.makeText(getApplicationContext(), "Please Sign in",Toast.LENGTH_LONG).show();	
		        	 Intent in1=new Intent(getApplicationContext(),Signin.class);
		        	 startActivity(in1);
		         }

	      	   }
	        });
	        
	    }	
}