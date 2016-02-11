package com.example.mock_converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText value1,value2;
	Button submit;
	TextView result;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		value1=(EditText) findViewById(R.id.edit_meter);
		value2=(EditText) findViewById(R.id.edit_km);
		submit=(Button) findViewById(R.id.buttonconvert);
		result=(TextView) findViewById(R.id.view_result);
		
		submit.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				result.setText("");
				String meter=value1.getText().toString();
				String km=value2.getText().toString();
				if (meter.length()!=0 &&  km.length()!=0)
				{
					Toast.makeText(MainActivity.this, "Enter only one value", Toast.LENGTH_SHORT).show();
					value1.setText("");
					value2.setText("");
				}
				else if(meter.length()!=0)
				{
					result.setText("");
					Double l1=Double.parseDouble(meter);
					String result_text=String.valueOf(l1*0.001);
					result.setText(meter+ "M in Kilometer is "+ result_text +"KM");
					//result.setText("");
			 		value1.setText("");
					value2.setText("");
					Toast.makeText(MainActivity.this, l1+"Meters is equals to"+result_text+"Kilometers", Toast.LENGTH_SHORT).show();
				
				}
				else if (km.length()!=0)
				{
					result.setText("");
					double l1=Double.parseDouble(km);
					double result1=(l1*1000);
					String result_text=String.valueOf(result1);
					result.setText(km+"Km in meters is"+result_text+" M");
					//result.setText("");
			 		value1.setText("");
					value2.setText("");
					Toast.makeText(MainActivity.this, l1+"KiloMeters is equals to"+result_text+"Meters", Toast.LENGTH_SHORT).show();
					
				}
				else if (meter.length()!=0 &&  km.length()!=0)
				{
					Toast.makeText(MainActivity.this, "Enter only one value", Toast.LENGTH_SHORT).show();
				
				}
				else if(meter.length()==0 || km.length()==0)
				{
					Toast.makeText(MainActivity.this, "Enter at least one value", Toast.LENGTH_SHORT).show();
				}
				
				
				}
			
		});
	}
		
	}

