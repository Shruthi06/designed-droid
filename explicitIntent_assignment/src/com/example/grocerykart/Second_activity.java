package com.example.grocerykart;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Second_activity extends Activity {
	Button shipok;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_activity);
		
		shipok=(Button) findViewById(R.id.buttonbilling);
		
		shipok.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				Toast.makeText(Second_activity.this, "Selected items are succesfully added to kart", Toast.LENGTH_LONG).show();
				Intent to_billing_address= new Intent(Second_activity.this, Shipping_address.class);
				startActivity(to_billing_address);
			}
		});
		
		
	}

	
}
