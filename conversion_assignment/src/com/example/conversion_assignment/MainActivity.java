package com.example.conversion_assignment;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner conversionlist;
	Button convert;
	EditText value1,value2;
	TextView result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		conversionlist=  (Spinner) findViewById(R.id.spinnerconversion_list);
		convert=(Button) findViewById(R.id.buttonconvert);
		value1=(EditText) findViewById(R.id.editTextvalue1);
		value2=(EditText) findViewById(R.id.editTextvalue2);
		result=(TextView) findViewById(R.id.result_textview);
		
		
		String [] list={"Meter to Kilometer", "Celsius to fharenheit","liters to MilliLiters","USD to INR"};
		ArrayAdapter< String> adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, list);
		conversionlist.setAdapter(adapter);
		
		conversionlist.setOnItemSelectedListener(new OnItemSelectedListener() 
		{

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				switch(position)
				{
				
				 case 0:	clear();
				 			value1.setHint("enter value in Meter");
				 			//value1.setHintTextColor(getTitleColor());
							value2.setHint("enter value in Kilometer");
							convert.setOnClickListener(new OnClickListener() 
							{
									@Override
									public void onClick(View v) 
									{
										String meter=value1.getText().toString();
										String kilometer=value2.getText().toString();
										
										if (meter.length()!=0 && kilometer.length()!=0)
										{
											Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
										}
										else if(meter.length()!=0)
										{
											Double l1=Double.parseDouble(meter);
											String result_text=String.valueOf(l1*0.001);
											MainActivity.this.result.setText(meter+ "Meters is equals to"+ result_text +"Kilometers");
											clear1();
											Toast.makeText(MainActivity.this, l1+"Meters is equals to"+result_text+"Kilometers", Toast.LENGTH_SHORT).show();
										}
										else if(kilometer.length()!=0)
										{
											double l1=Double.parseDouble(kilometer);
											double result=(l1*1000);
											String result_text=String.valueOf(result);
											MainActivity.this.result.setText(kilometer+"KiloMeters is equals to"+result_text+" meters");
											clear1();
											Toast.makeText(MainActivity.this, l1+"KiloMeters is equals to"+result_text+"Meters", Toast.LENGTH_SHORT).show();
										}
										else if(meter.length()==0 || kilometer.length()==0)
										{
											Toast.makeText(MainActivity.this, "Please Enter any one value", Toast.LENGTH_SHORT).show();
										}
										else if (meter.length()!=0 && kilometer.length()!=0)
										{
											Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
										}
										else if (meter.length()==0 && kilometer.length()==0)
										{
											Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
										}
										
									}
							});
					break;
					
				 case 1:clear();
				 		value1.setHint("enter value in Celsius");
				 		value2.setHint("enter value in Fharenheit");
					convert.setOnClickListener(new OnClickListener() 
					{
							@Override
							public void onClick(View v) 
							{
								String celsi=value1.getText().toString();
								String fhar=value2.getText().toString();
								 if(celsi.length()!=0)
								{
									Double l1=Double.parseDouble(celsi);
									double result= (l1*1.8+32);
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(celsi +" celsius is equals to"+result_text+"Fharenheit");
									clear1();
									Toast.makeText(MainActivity.this, l1+"Celsius is equals to"+result_text+"Fharenheit", Toast.LENGTH_SHORT).show();
								}
								else if(fhar.length()!=0)
								{
									double l1=Double.parseDouble(fhar);
									double result=(l1-32)/1.8;
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(fhar +"Fharenheit is equals to"+result_text+"celsius");
									clear1();
									Toast.makeText(MainActivity.this, l1+" Fharenheit is equals to"+result_text+"Celsius", Toast.LENGTH_SHORT).show();
								}
								else if(celsi.length()==0 || fhar.length()==0)
								{
									Toast.makeText(MainActivity.this, "Please Enter any one value", Toast.LENGTH_SHORT).show();
								}
								else if (celsi.length()!=0 && fhar.length()!=0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
								else if (celsi.length()==0 && fhar.length()==0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
							}
					});
					
			break;
				 case 2:clear();
				 
					 value1.setHint("enter value in Liters");
					value2.setHint("enter value in MilliLiters");
					convert.setOnClickListener(new OnClickListener() 
					{
							@Override
							public void onClick(View v) 
							{
								String ltr=value1.getText().toString();
								String mililtr=value2.getText().toString();
								 if(ltr.length()!=0)
								{
									Double l1=Double.parseDouble(ltr);
									double result= (l1*1000);
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(ltr+"liter is euals to"+result_text+"milliliters");
									clear1();
									Toast.makeText(MainActivity.this, l1+" Liters is equals to"+result_text+"Milliliters", Toast.LENGTH_SHORT).show();
								}
								else if(mililtr.length()!=0)
								{
									double l1=Double.parseDouble(mililtr);
									double result=(l1/1000);
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(mililtr+"milliliter is equals to"+result_text+"liters");
									clear1();
									Toast.makeText(MainActivity.this, l1+" Milliliters is equals to"+result_text+"Liters", Toast.LENGTH_SHORT).show();
								}
								else if(ltr.length()==0 || mililtr.length()==0)
								{
									Toast.makeText(MainActivity.this, "Please Enter any one value", Toast.LENGTH_SHORT).show();
								}
								else if (ltr.length()!=0 && mililtr.length()!=0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
								else if (ltr.length()==0 && mililtr.length()==0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
							}
					});
			break;
			case 3:		clear();
						value1.setHint("enter value in USD");
						value2.setHint("enter value in INR");
						convert.setOnClickListener(new OnClickListener() 
						{
							@Override
							public void onClick(View v) 
							{
								String usd=value1.getText().toString();
								String inr=value2.getText().toString();
								 if(usd.length()!=0)
								{
									Double l1=Double.parseDouble(usd);
			
									double result= (l1*67.52);
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(usd+"usd is equals to"+result_text+"INR");
									clear1();
									Toast.makeText(MainActivity.this, l1+" USD is equals to"+result_text+"INR", Toast.LENGTH_SHORT).show();
								}
								else if(inr.length()!=0)
								{
									double l1=Double.parseDouble(inr);
									double result=(l1/67.52);
									String result_text=String.valueOf(result);
									MainActivity.this.result.setText(inr+"INR is equals to"+result_text+"USD");
									clear1();
									Toast.makeText(MainActivity.this, l1+" INR is equals to"+result_text+"USDs", Toast.LENGTH_SHORT).show();
								}
								else if(usd.length()==0 || inr.length()==0)
								{
									Toast.makeText(MainActivity.this, "Please Enter any one value", Toast.LENGTH_SHORT).show();
								}
								else if (usd.length()!=0 && inr.length()!=0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
								else if (usd.length()==0 && inr.length()==0)
								{
									Toast.makeText(MainActivity.this, "SORRY!!!! Enter any one value", Toast.LENGTH_LONG).show();
								}
							}
						});
						break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
			}
		});
	}


	public void clear() 
	{
		result.setText("");
 		value1.setText("");
		value2.setText("");
	}
	public void clear1()
	{
		value1.setText("");
		value2.setText("");
	}
}
