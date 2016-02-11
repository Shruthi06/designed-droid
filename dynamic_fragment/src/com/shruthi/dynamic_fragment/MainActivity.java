package com.shruthi.dynamic_fragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button click;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		click=(Button) findViewById(R.id.buttonmain);
		
		click.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				FragmentManager fm=getFragmentManager();
				FragmentTransaction ft= fm.beginTransaction();
				
				fragment_activity fa= new fragment_activity();
				ft.add(R.id.mainactivity_id, fa);
				ft.addToBackStack("frag1");
				ft.commit();
				
				
			}
		});
	}

	

}
