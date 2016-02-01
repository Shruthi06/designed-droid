package com.shruthi.radio_toggle;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
	CheckBox checkred, checkblue;
	RadioGroup radiogroup1;
	TextView result,resultradio;
	String s, s1="\0", s2="\0";
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		checkred=(CheckBox) findViewById(R.id.checkred);
		checkblue=(CheckBox) findViewById(R.id.checkblue);
		result=(TextView) findViewById(R.id.result);
		resultradio=(TextView) findViewById(R.id.editTextradio);
		radiogroup1=(RadioGroup) findViewById(R.id.radioGroup1);
		
		
		
		/*if(checkred.isChecked())
		{
			Log.d("[DEBUG]", "red is selected");
			
		}*/
		
		checkred.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean state) 
			{
				// TODO Auto-generated method stub
				if(state==true)
				{
					s1="red is selected";
					s=s1+s2;
					result.setText(s);
				}
				
				
			}

		});
		
		
		/*if  (checkblue.isChecked())
		{
			Log.d("[DEBUG]", "option 2 is selected");
			
		}*/
		checkblue.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean state) 
			{
				// TODO Auto-generated method stub
				if(state==true)
				{
					s2="blue is selected";
					s=s1+s2;
					result.setText(s);
				}
				
				
			}

		});
		

	}
	public void onCheckedChanged(RadioGroup arg0, int id) 
	{
		switch (id) 
		{
		case 0:Log.d("[DEBUG]", "1st Radio button is selected");
		break;
		
		case 1:Log.d("[DEBUG]", "2nd Radio button is selected");
		break;
		
		case 2:resultradio.setText("selected j2ee");
		break;
		
		default:
			break;
		}
		
	}

	
}
