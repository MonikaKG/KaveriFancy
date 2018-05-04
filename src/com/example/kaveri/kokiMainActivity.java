package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class kokiMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kokiactivity_main);
    }

    public void perfume1(View v)
 	{
 		Intent in = new Intent(getApplicationContext(),kokiMainActivity1.class);
 		startActivity(in);
 	}
    public void perfume2(View v)
 	{
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();

 	}
    public void perfume3(View v)
 	{
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    public void perfume4(View v)
 	{
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    public void perfume5(View v)
 	{
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    public void perfume6(View v)
 	{
 		//Intent in = new Intent(getApplicationContext(),kokiMainActivity6.class);
 		//startActivity(in);
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    public void perfume7(View v)
 	{
 		//Intent in = new Intent(getApplicationContext(),kokiMainActivity7.class);
 		//startActivity(in);
 		Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}	
    public void perfume8(View v)
 	{
 		//Intent in = new Intent(getApplicationContext(),kokiMainActivity8.class);
 		//startActivity(in);
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    public void perfume9(View v)
 	{
 		//Intent in = new Intent(getApplicationContext(),kokiMainActivity9.class);
 		//startActivity(in);
    	Toast.makeText(getApplicationContext(), "Sorry stock not availabe", Toast.LENGTH_LONG).show();
 	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
