package com.shruthi.data_transfer_intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second_MainActivity extends Activity 
{
	EditText input;
	Button click;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second__main);
		
		input=(EditText) findViewById(R.id.editTextinput);
		click=(Button) findViewById(R.id.buttonsubmit);
		
		click.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View arg0) 
			{
				String sent_msg=input.getText().toString();
				Intent sendintent=new Intent();
				sendintent.putExtra("key1", sent_msg);
				setResult(RESULT_OK, sendintent);
				finish();
				}
				
			
		});
	
	}

	
}
