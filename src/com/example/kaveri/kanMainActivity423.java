package com.example.kaveri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class kanMainActivity423 extends Activity {
	Button bt;
	EditText ed1,ed2,ed3;
	TextView tv1,tv2;
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kanbuydet2);
        bt=(Button)findViewById(R.id.button1);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText4);
        ed3=(EditText)findViewById(R.id.editText5);
        tv2=(TextView)findViewById(R.id.textView3);
        tv1=(TextView)findViewById(R.id.textView2);
        iv=(ImageView)findViewById(R.id.imageView1);
        bt.setOnClickListener(new OnClickListener()
    	{
			public void onClick(View v) 
			{
				String name=ed1.getText().toString();
				String prod=tv1.getText().toString();
				int qty=Integer.parseInt(ed3.getText().toString());
				String addr=ed2.getText().toString();
				int amt=Integer.parseInt(tv2.getText().toString());
				amt*=qty;
				Intent intent=new Intent(getApplicationContext(),kanMainActivity421.class);
				Bundle b = new Bundle();
				b.putString("name",name);
				b.putString("prod", prod);
				b.putString("addr", addr);
				b.putInt("amt", amt);
				b.putInt("image",R.drawable.nail77);
				intent.putExtras(b);
				startActivity(intent);
			}
    	});       
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
