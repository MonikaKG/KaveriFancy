package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Earings1 extends Activity{
	Button bt;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.earings1);
	        bt=(Button)findViewById(R.id.button1); 
	    }
	 	public void ear2fun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Purchase1.class);
	 		startActivity(in);
	 	}
	 	public void nextpage(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Earings.class);
	 		startActivity(in);
	 	}

}
