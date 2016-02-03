package com.shruthi.spinner_assignment;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView results;
	Spinner subjectspinner;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final String [] electivesubject={"computer graphics", "advance architecture","bio-informatics","thermo dynamics","operation research","artificial intelligence"};
		results=(TextView) findViewById(R.id.editresult);
		subjectspinner=(Spinner) findViewById(R.id.spinnersubject);
		
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, electivesubject);
		subjectspinner.setAdapter(adapter);
		
		
		subjectspinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				String s=electivesubject[position];
				results.setText("you selected elective subject as   "+s);
				//Toast.makeText(min, text, duration)
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

	

}
