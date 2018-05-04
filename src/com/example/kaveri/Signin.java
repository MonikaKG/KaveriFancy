package com.example.kaveri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends Activity{
	EditText ed1,ed2;
	VivzDatabaseAdapter vivzhelper;
	public static final String MyPREFERENCES = "MyPrefs" ;
	Button bt1,bt2;
	SharedPreferences sharedpreferences;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.signin);
	        ed1=(EditText)findViewById(R.id.editText1);
	        ed2=(EditText)findViewById(R.id.editText2);
	        bt1=(Button)findViewById(R.id.button1);
	        bt2=(Button)findViewById(R.id.button2);
	        vivzhelper=new VivzDatabaseAdapter(this);
	        bt1.setOnClickListener(new View.OnClickListener() 
	        {
	      	   @Override
	      	   public void onClick(View v) 
	      	   {
	      		 String name=ed1.getText().toString();
	     		 String pass=ed2.getText().toString();
	     		 String result=vivzhelper.getData(name, pass);
	     		 if(result!="")
	     		 {
	     			sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
	     			SharedPreferences.Editor editor = sharedpreferences.edit();
	                editor.putString("Name", name);
	                editor.putString("Pass", pass);
	                editor.commit();
	                Intent intent1=new Intent(getApplicationContext(),Collections.class);
					startActivity(intent1);
	     		 }
	     		}
	        });
	        bt2.setOnClickListener(new View.OnClickListener() {
		      	   
		      	   @Override
		      	   public void onClick(View v) 
		      	   {
		      		 Intent intent=new Intent(getApplicationContext(),Update1.class);
					 startActivity(intent);
   
		      	   }
	    });
	 }

}
