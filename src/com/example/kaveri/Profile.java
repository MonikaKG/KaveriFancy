package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Profile extends Activity{
	EditText ed1,ed2,ed3,ed4,ed5;
	Button bt,bt1;
	private Bitmap currentImage;
	ImageView iv;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        ed5=(EditText)findViewById(R.id.editText5);
        iv=(ImageView)findViewById(R.id.imageView1);
        bt=(Button)findViewById(R.id.button1);
        bt1=(Button)findViewById(R.id.button2);  
        bt.setOnClickListener(new View.OnClickListener() {
     	   
     	   @Override
     	   public void onClick(View v) 
     	   {
     		   String name=ed1.getText().toString();
     		   String pass=ed2.getText().toString();
     		   String phone=ed3.getText().toString();
     		   String email=ed4.getText().toString();
    		   String address=ed5.getText().toString();     		   
     				   
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
