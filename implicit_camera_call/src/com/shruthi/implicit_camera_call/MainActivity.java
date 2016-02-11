package com.shruthi.implicit_camera_call;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{

	Button camerabutton,callbutton,browserbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		camerabutton=(Button) findViewById(R.id.buttoncamera);
		callbutton=(Button) findViewById(R.id.buttonccall);
		browserbutton=(Button) findViewById(R.id.buttonbrowse);
		
		camerabutton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivity(intent);
			}
		});
		callbutton.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View arg0) 
			{
				Intent intent=new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"9449449494"));
				startActivity(intent);
			}
		});
		browserbutton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent= new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.google.com"));
				startActivity(intent);
			}
		});
	}

	

}
