package com.andriod.caller;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView listviewcall;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final String[] Names = {"John","Sophie","Sally","Jacob","Tom","Cassy","Ana","Lily","Daisy","Ella","Harry","Bob"};
		listviewcall =(ListView) findViewById(R.id.listViewcall);
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,Names);
		listviewcall.setAdapter(adapter);
		listviewcall.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Bundle b=new Bundle();
				b.putString("John","9988779900");
				b.putString("Sophie","9898775343");
				b.putString("Sally", "9890908765");
				b.putString("Jacob","9090112233");
				b.putString("Tom", "9123456777");
				b.putString("Cassy","9900887766");
				b.putString("Ana","9898005566");
				b.putString("Lily", "9234534544");
				b.putString("Daisy","9456782211");
				b.putString("Ella", "9898776776");
				b.putString("Harry","8989676745");
				b.putString("Bob", "9988787878");
				emergency(b.getString(Names[position]));
				
				
				
			}
		});
		
			
		}
	public void emergency( String s){
		
		Intent intent=new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse("tel:"+s));
		startActivity(intent);
		
			
			
		
	}

	
}
