package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText name;
	
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		name=(EditText) findViewById(R.id.editText0);
	
		button=(Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {
			
			
			@Override
         		public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,SecondAcitivity.class);
				Bundle b=new Bundle();
				/*if(name.getText().toString().length()==0)
				{
					name.setError("name is required");
				}*/
				b.putString("name1",name.getText().toString());
	            intent.putExtras(b);
	            startActivity(intent);
	                    
	
				
			}
		});
		
		
	}
}

	
	


