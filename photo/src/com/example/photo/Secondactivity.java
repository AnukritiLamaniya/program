package com.example.photo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Secondactivity extends Activity {
	
	ImageView view;
	Button button; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		  Bitmap bitmap  = (Bitmap) getIntent().getExtras().get("name");
	        ImageView view = (ImageView) findViewById(R.id.viewphoto);
	        button=(Button) findViewById(R.id.backbutton);
	        view.setImageBitmap(bitmap);
	        button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent intent=new Intent(Secondactivity.this,MainActivity.class);
					startActivity(intent);
					
				}
			});
	      
	        //Intent intent=new Intent(this,MainActivity.class);
	        
	}

	

}
