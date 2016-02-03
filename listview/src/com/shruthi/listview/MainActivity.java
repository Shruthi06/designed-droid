package com.shruthi.listview;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ListView grocerylist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		grocerylist=(ListView) findViewById(R.id.grocerylist);
		final String[] grocery_item={"fruites","vegitables","poultry","backery","spices","grains"};
		ArrayAdapter<String> grocery_adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, grocery_item);
		grocerylist.setAdapter(grocery_adapter);
		
		
		grocerylist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Toast.makeText(MainActivity.this, "you have selected  " + grocery_item[position], Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
	}

	
	
	

}
