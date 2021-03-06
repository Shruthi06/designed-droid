package com.shruthi.thread_demo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button start;
	TextView status;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		start=(Button) findViewById(R.id.buttonstart);
		status=(TextView) findViewById(R.id.textViewstatus);
		
		
		start.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				longrunning_task();
				status.setText(" downloading completed");
			}
		});
	}

	public void longrunning_task()
	{
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				int i;
				Log.d("[DEBUG]", "Running Long Running Task");
				for ( i = 0; i <=0; i++) 
				{
					try 
					{
						Thread.sleep(200);
						
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					//Toast.makeText(MainActivity.this, " downloading.....", Toast.LENGTH_SHORT).show();
					
				}
				Log.d("[DEBUG]", "End Of Long Running Task");
				
			}
		}).start();
	}

}
