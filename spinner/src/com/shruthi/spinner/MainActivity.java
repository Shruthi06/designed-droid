package com.shruthi.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Spinner groceryspinr;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		groceryspinr.findViewById(R.id.grossaryspinner);
		
		
		final String [] grocery={"vegitables", "fruites", "poultry", "spices","grains","icecreames"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,grocery);
		groceryspinr.setAdapter(adapter);
		
		groceryspinr.setOnItemSelectedListener(new OnItemSelectedListener() {

			/*@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				Log.d("[DEBUG]", phonebrands[position]);
				
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
				// TODO Auto-generated method stub
				
			}*/

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int position, long arg3) 
			{
				Log.d("[DEBUG]", grocery[position]);
				
				Toast.makeText(MainActivity.this,grocery[position],Toast.LENGTH_SHORT).show();
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	

}