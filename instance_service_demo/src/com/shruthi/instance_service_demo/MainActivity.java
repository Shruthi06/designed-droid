package com.shruthi.instance_service_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button start,stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		start=(Button) findViewById(R.id.buttonstart);
		stop=(Button) findViewById(R.id.buttonstop);
		
		start.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				Intent start_intent= new Intent(MainActivity.this, intentservice.class);
				startService(start_intent);
			}
		});
		
		stop.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				Intent stop_intent=new Intent(MainActivity.this, intentservice.class);
				stopService(stop_intent);
			}
		});
		
	}

	
}