package com.example.kaveri;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

@SuppressLint("NewApi") public class Home extends Activity{
	ImageButton ib;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.home);
	        ib=(ImageButton)findViewById(R.id.imageButton1);
	    }
	 public void menufun(View v)
	 {
		 PopupMenu popup = new PopupMenu(Home.this, ib); 
         popup.getMenuInflater().inflate(R.menu.main_menu, popup.getMenu());  
         popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() 
         {  
          public boolean onMenuItemClick(MenuItem item)
          {  
             switch(item.getItemId())
             {
             case R.id.item1:  
             {
            	 Toast.makeText(getApplicationContext(),"Navigating Home Now",Toast.LENGTH_LONG).show(); 
            	 Intent intent1 = new Intent(getApplicationContext(),Welcome.class);
             	 startActivity(intent1);
             	 return true;  
             }    
              case R.id.item2:  
              {
            	Toast.makeText(getApplicationContext(),"Signup your account",Toast.LENGTH_LONG).show(); 
           	   	Intent intent1 = new Intent(getApplicationContext(),Signup.class);
           	   	startActivity(intent1);
           	   	return true;  
              }                 
               case R.id.item3:  
               {
                Toast.makeText(getApplicationContext(),"Signin your account",Toast.LENGTH_LONG).show(); 
               	Intent intent = new Intent(getApplicationContext(),Signin.class);
               	startActivity(intent);
               	return true; 
               } 
               case R.id.item4:  
               {
              	 Toast.makeText(getApplicationContext(),"See our Collection",Toast.LENGTH_LONG).show(); 
              	 Intent intent1 = new Intent(getApplicationContext(),Collections.class);
               	 startActivity(intent1);
               	 return true;  
               }    
                               
                 case R.id.item6:  
                 {
                  Toast.makeText(getApplicationContext(),"Change your profile",Toast.LENGTH_LONG).show(); 
                 	Intent intent = new Intent(getApplicationContext(),Profile.class);
                 	startActivity(intent);
                 	return true; 
                 }  
                 case R.id.item7:  
                 {
                  Toast.makeText(getApplicationContext(),"Join us with social media",Toast.LENGTH_LONG).show(); 
                 	Intent intent = new Intent(getApplicationContext(),Aboutus.class);
                 	startActivity(intent);
                 	return true; 
                 }  
                 case R.id.item8:  
                 {
                  Toast.makeText(getApplicationContext(),"Logout",Toast.LENGTH_LONG).show(); 
                  SharedPreferences sharedpreferences = getSharedPreferences(Signin.MyPREFERENCES, Context.MODE_PRIVATE);
                  SharedPreferences.Editor editor = sharedpreferences.edit();
                  editor.clear();
                  editor.commit();
                  return true; 
                 }  
                 default:  
                   return false;
             }  
          }  
         });  
         popup.show();  
	 }

}
