package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Signup extends Activity{
	EditText ed1,ed2,ed3,ed4,ed5;
	CheckBox cb;
	Button bt,bt1;
	private Bitmap currentImage;
	ImageView iv;
	VivzDatabaseAdapter vivzhelper;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        ed5=(EditText)findViewById(R.id.editText5);
        cb=(CheckBox)findViewById(R.id.checkBox1);
        iv=(ImageView)findViewById(R.id.imageView1);
        bt=(Button)findViewById(R.id.button1);
        bt1=(Button)findViewById(R.id.button2);  
        vivzhelper=new VivzDatabaseAdapter(this);
        bt.setOnClickListener(new View.OnClickListener() {
     	   
     	   @Override
     	   public void onClick(View v) 
     	   {
     		  if(cb.isChecked())
     		  {
     		   String name=ed1.getText().toString();
     		   String pass=ed2.getText().toString();
     		   String phone=ed3.getText().toString();
     		   String email=ed4.getText().toString();
    		   String address=ed5.getText().toString();  
    		   long id = vivzhelper.insertdata(name,email,pass,phone,address);
    		   if(id<0)
    			  Toast.makeText(getApplicationContext(),"NOT REGISTERED YOUR ACCOUNT",Toast.LENGTH_LONG).show();
    		   else
    			   Toast.makeText(getApplicationContext(),"SUCCESSFULLY REGISTERED YOUR ACCOUNT",Toast.LENGTH_LONG).show();
     		  }
     		  else
     			  Toast.makeText(getApplicationContext(), "Accept the terms and conditions",Toast.LENGTH_LONG).show();    		   
     				   
     	   }      
        });
	}
	public void imagefun(View v)
	{
		Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
	    photoPickerIntent.setType("image/*");
	    startActivityForResult(photoPickerIntent, 1);
	}
	@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
        if (resultCode == RESULT_OK) {
               Uri photoUri = data.getData();
               if (photoUri != null) {
                   try {
   currentImage = MediaStore.Images.Media.getBitmap(this.getContentResolver(), photoUri);
                       iv.setImageBitmap(currentImage);
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
           }
       }
}
