package com.shruthi.explicit_intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class Activity_second extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}
	
}
