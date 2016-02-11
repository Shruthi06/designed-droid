package com.shruthi.camera_intent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	
	Button cameraclick;
	ImageView showimage;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		cameraclick=(Button) findViewById(R.id.button_startcamera);
		showimage=(ImageView) findViewById(R.id.imageView_image);
			
		
		cameraclick.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivity(intent);
			}
		});
	
	} 
		protected void onActivityResult(int requestCode, int resultCode, Intent data) 
		{
			if(resultCode==RESULT_OK)
			{
				Bitmap bitmap =  (Bitmap)data.getExtras().get("data");
				showimage.setImageBitmap(bitmap);
				
			}
			
			else if(resultCode==RESULT_CANCELED)
			{
				Toast.makeText(MainActivity.this,"ERROR",Toast.LENGTH_SHORT).show();
			}
		}
		
		
		
	}

	

