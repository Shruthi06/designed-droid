package com.shruthi.meter_to_km;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button submit;
	EditText metr;
	TextView result;
	ExpandableListView list1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		submit=(Button) findViewById(R.id.buttonsublit);
		metr=(EditText) findViewById(R.id.meter);
		result= (TextView) findViewById(R.id.textViewresult);
		list1=(ExpandableListView) findViewById(R.id.expandableList);
		
		String [] list={"Meter to Kilometer", "Celsius to fharenheit","liters to MilliLiters","USD to INR"};
		ArrayAdapter< String> adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, list);
		list1.setAdapter(adapter);
		
		
		submit.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				String meter=metr.getText().toString();
				long l1=Integer.parseInt(meter);
				//result.setText(String.valueOf(l1));
				//long l1=Integer.parseInt(meter);
				double resultlong=(l1*0.001);
				String result_text=String.valueOf(resultlong);
				result.setText(result_text);

			}
		});
		
	}

	

}
