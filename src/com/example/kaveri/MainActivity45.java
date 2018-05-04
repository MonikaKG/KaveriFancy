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
import android.widget.Toast;

public class MainActivity45 extends Activity {
	Button bt;
	EditText ed1,ed2,ed3,ed4;
	TextView tv1,tv2;
	ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buydet1);
        bt=(Button)findViewById(R.id.button1);
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        Intent intent =getIntent();
        String oper=intent.getStringExtra("result");
        String[] values=oper.split(":");
        ed1.setText(values[0]);
        ed2.setText(values[1]);
        ed3.setText(values[2]);
        ed4.setText(values[3]); 
        tv2=(TextView)findViewById(R.id.textView3);
        tv1=(TextView)findViewById(R.id.textView2);
        iv=(ImageView)findViewById(R.id.imageView1);
        bt.setOnClickListener(new OnClickListener()
    	{
			public void onClick(View v) 
			{
				 Toast.makeText(getApplicationContext(),"YOUR BOOKING IS CONFIRMED",Toast.LENGTH_LONG).show();
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
