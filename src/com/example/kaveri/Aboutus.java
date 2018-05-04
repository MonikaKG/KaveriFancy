package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class Aboutus extends Activity
{
	EditText ed1;
	RatingBar rb;
	ImageButton ib1,ib2,ib3;
	public String ratedValue;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.aboutus);
	        ed1=(EditText)findViewById(R.id.editText1);
	        rb=(RatingBar)findViewById(R.id.ratingBar1);
	        ib1=(ImageButton)findViewById(R.id.imageButton1);
	        ib2=(ImageButton)findViewById(R.id.imageButton2);
	        ib3=(ImageButton)findViewById(R.id.imageButton3);
	        rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
	            public void onRatingChanged(RatingBar ratingBar, float rating,
	                    boolean fromUser) {
	                ratedValue = String.valueOf(rb.getRating());	 
	                String str="Rated Value is ";
	                str=str+ratedValue;
	                Toast.makeText(getApplicationContext(),str, Toast.LENGTH_LONG).show();
	            }
	        });
	        ib1.setOnClickListener(new View.OnClickListener() {
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		   String url1="https://www.facebook.com";
		            	Intent in1=new Intent(Intent.ACTION_VIEW);
		        		in1.setData(Uri.parse(url1));
		        		startActivity(in1);
		      	   }
	        });
	        ib2.setOnClickListener(new View.OnClickListener() {
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		   	String url="https://www.plus.google.com";
		            	Intent in=new Intent(Intent.ACTION_VIEW);
		        		in.setData(Uri.parse(url));
		        		startActivity(in); 
		      	   }
	        });
	        ib3.setOnClickListener(new View.OnClickListener() {
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		   	String url2="https://www.twitter.com";
		            	Intent in2=new Intent(Intent.ACTION_VIEW);
		        		in2.setData(Uri.parse(url2));
		        		startActivity(in2);
		      	   }
	        });
	        
	        
	 }
}
