package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class KanMainActivity1 extends Activity{
	ImageButton ib;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.kanactivity_main1);
	     
	        
	    }
	 
	 
	 public void nailfun1(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),kanMainActivity41.class);
	 		startActivity(in);
	 	}
	 
	 public void nailfun2(View v)
	 	{
	 		//Intent in = new Intent(getApplicationContext(),kanMainActivity42.class);
	 		//startActivity(in);
		 
		 	Toast.makeText(getApplicationContext(),"Sorry stock not available . Try our other best collections",Toast.LENGTH_LONG).show();
	 	}
	 
	 public void nailfun3(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),kanMainActivity43.class);
	 		startActivity(in);
	 	}
	 
	 public void nailfun4(View v)
	 	{
	 		//Intent in = new Intent(getApplicationContext(),kanMainActivity44.class);
	 		//startActivity(in);
		 	Toast.makeText(getApplicationContext(),"Sorry stock not available . Try our other best collections",Toast.LENGTH_LONG).show();

	 	}
	 
	 public void nailfun5(View v)
	 	{
	 		//Intent in = new Intent(getApplicationContext(),kanMainActivity45.class);
	 	//	startActivity(in);
		 	Toast.makeText(getApplicationContext(),"Sorry stock not available . Try our other best collections",Toast.LENGTH_LONG).show();

	 	}
}