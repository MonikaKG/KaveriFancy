package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Purchase1 extends Activity{
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.purchase1);
	        bt=(Button)findViewById(R.id.button1);	        
	    }	 
	 	public void purfun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Purchasedes1.class);
	 		startActivity(in);
	 	}

}
