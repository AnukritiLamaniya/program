package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class SecondAcitivity extends Activity {
	TextView t1,t2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_acitivity);
	
		
		
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView) findViewById(R.id.textView2);
		Intent intent=getIntent();
				
		Bundle b1=getIntent().getExtras(); 
		String s1= b1.getString("name1");
		t1.setText(s1);
		
		
		
		
		
	}

	

	

	

}
