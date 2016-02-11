package com.shruthi.data_transfer_intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView outtext;
	Button submit;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		outtext=(TextView) findViewById(R.id.textViewresult);
		submit=(Button) findViewById(R.id.button_launch);
		
		submit.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent= new Intent(MainActivity.this,Second_MainActivity.class);
				startActivityForResult(intent,123);
			}
		});

		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent received_intent) 
	{
		super.onActivityResult(requestCode, resultCode, received_intent);
		if(resultCode==RESULT_OK)
		{
			Bundle bundle=received_intent.getExtras();
			String received_msg =bundle.getString("key1");
			
			if(received_msg.length()==0)
			{
				Toast.makeText(MainActivity.this,"You have Entered NO Message" , Toast.LENGTH_SHORT).show();
			}
			outtext.setText(received_msg);
			
		}
		else
		{
			Toast.makeText(MainActivity.this, "ERROR result code not Matching", Toast.LENGTH_SHORT).show();
		}
	}
	
}

