package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Earings extends Activity{
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.earings);
	        bt=(Button)findViewById(R.id.button1); 
	    }
	 	public void ear1fun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Purchase.class);
	 		startActivity(in);
	 	}
	 	public void nextpage(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Earings1.class);
	 		startActivity(in);
	 	}

}
