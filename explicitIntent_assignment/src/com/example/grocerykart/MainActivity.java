package com.example.grocerykart;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button login;
	EditText un,pw;
	String stusername1="shruthi";
	String stpassword2="neeta";
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		un=(EditText) findViewById(R.id.editTextun);
		pw=(EditText) findViewById(R.id.editTextpw);
		login=(Button) findViewById(R.id.buttonlogin);
		
		
		login.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				String entun=un.getText().toString();
				   String enpsw=pw.getText().toString();
				   
				   
				   if(true)
				   {
					   
						   if(entun.equalsIgnoreCase(stusername1) && enpsw.equalsIgnoreCase(stpassword2))
						   {
							   Toast.makeText(MainActivity.this, "login succesful", Toast.LENGTH_SHORT).show();
							   Intent second_page= new Intent(MainActivity.this, Second_activity.class);
							   startActivity(second_page);
						   }
					   
					   
					  
					
				   }
				   
				   
					   Toast.makeText(MainActivity.this, "user name or password is incorrect. Please try again", Toast.LENGTH_SHORT).show();
				  
			}
		});
		
		
	}

	

}
