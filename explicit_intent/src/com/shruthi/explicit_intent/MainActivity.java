package com.shruthi.explicit_intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button buttonlaunch;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonlaunch=(Button) findViewById(R.id.launch_btton);
		buttonlaunch.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intentmaintosecond= new Intent(MainActivity.this, Activity_second.class);
				startActivity(intentmaintosecond);
				
				
			}
		});
	}

	
}
