package com.shruthi.linkdinlogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText ussername,password;
	Button login;
	String [] stusername1={"shruthi","pramila","vani"};
	String [] stpassword2={"neeta","anita","reva"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ussername=(EditText) findViewById(R.id.editTextusername);
		password=(EditText) findViewById(R.id.editpassword);
		login=(Button) findViewById(R.id.Login);
		
		
		login.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View v) 
			{
			   String entun=ussername.getText().toString();
			   String enpsw=password.getText().toString();
			   if(true)
			   {
				   for(int i=0;i<stusername1.length ;i++)
				   {
					   if(entun.equalsIgnoreCase(stusername1[i]) && enpsw.equalsIgnoreCase(stpassword2[i]))
					   {
						   Toast.makeText(MainActivity.this, "login succesful", Toast.LENGTH_SHORT).show();
					   }
				   
				   }
			   
			   
				   Toast.makeText(MainActivity.this, "user name or password is incorrect. Please try again", Toast.LENGTH_SHORT).show();
			   
			   }
			}
		});
		
		
	}

	
}
