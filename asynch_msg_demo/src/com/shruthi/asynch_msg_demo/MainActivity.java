package com.shruthi.asynch_msg_demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	Button startbutton;
	TextView status;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		startbutton=(Button) findViewById(R.id.buttonstart);
		status=(TextView) findViewById(R.id.textViewstatus);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				asynchdemo obj1=new asynchdemo(status);
				obj1.execute();
			
			}
		});
	}

	
}
