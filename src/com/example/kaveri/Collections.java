package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Collections extends Activity{
	ImageButton ib;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.collections);
	        ib=(ImageButton)findViewById(R.id.imageButton5);
	        
	    }
	 
	 	public void desfun(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),Earings.class);
	 		startActivity(in);
	 	}
	 	
	 	public void mynail(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),KanMainActivity1.class);
	 		startActivity(in);
	 	}
	 	
	 	public void perfumes(View v)
	 	{
	 		Intent in = new Intent(getApplicationContext(),kokiMainActivity.class);
	 		startActivity(in);
	 	}
	 	public void undercons(View v)
	 	{
	 		Toast.makeText(getApplicationContext(), "Page under construction", Toast.LENGTH_LONG);
	 	}
}
