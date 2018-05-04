package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kanMainActivity411 extends Activity{
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.kanpurchasedes1);
	        bt=(Button)findViewById(R.id.button1);
	        
	    }	 
	 	public void buyfun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),kanMainActivity431.class);
	 		startActivity(in);
	 	}

}