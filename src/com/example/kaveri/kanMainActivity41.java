package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class kanMainActivity41 extends Activity{
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.kanactivity_main41);
	        bt=(Button)findViewById(R.id.button1);
	        
	    }
	 
	 	public void purfun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),kanMainActivity411.class);
	 		startActivity(in);
	 	}
}
