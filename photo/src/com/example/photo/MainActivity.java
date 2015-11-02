package com.example.photo;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final int CAPTUREIMAGE = 100;
	Button b;
	TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview=(TextView) findViewById(R.id.textView);
		 Button b = (Button) findViewById(R.id.buttoncamera);
	        b.setOnClickListener(new OnClickListener() 
	        {
	            public void onClick(View v) 
	            {
	                
	                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	                
	                startActivityForResult(intent, CAPTUREIMAGE);
	            }
	        });
	    } @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	    {
	        if (requestCode == CAPTUREIMAGE) 
	        {
	            
	            if (resultCode == RESULT_OK) 
	            {
	                Bitmap bm = (Bitmap) data.getExtras().get("data");

	                Intent intent = new Intent(this, Secondactivity.class);
	                intent.putExtra("name", bm );
	                startActivity(intent);

	            } 
	            else if (resultCode == RESULT_CANCELED) 
	            {
	                Toast.makeText(MainActivity.this," error in image capture",Toast.LENGTH_SHORT).show();
	            } 
	        }
	          
	
	    }
}

	
	


