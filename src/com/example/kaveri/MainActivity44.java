package com.example.kaveri;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity44 extends Activity
{
	TextView tv1,tv2,tv3,tv4;
	ImageView iv;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	 {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.orderdes);
	        tv1=(TextView)findViewById(R.id.textView2);
	        tv2=(TextView)findViewById(R.id.textView4);
	        tv3=(TextView)findViewById(R.id.textView6);
	        tv4=(TextView)findViewById(R.id.textView3);
	        SharedPreferences sp = getSharedPreferences("mypreferencedemo",Context.MODE_PRIVATE);
	        String name="Name :"+sp.getString("name", null);
	        String prod="Product :"+sp.getString("prod",null);
	        int amt=sp.getInt("amt",0);
	        String result=Integer.toString(amt);
	        String amount=("Total Rs.:"+result);
	        String addr="Address :"+sp.getString("addr",null);
	        tv1.setText(name);
	        tv2.setText(amount);
	        tv3.setText(addr); 
	        tv4.setText(prod);	        
	 }
}
