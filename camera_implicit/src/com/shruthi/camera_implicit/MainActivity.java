package com.shruthi.camera_implicit;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button click;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		click=(Button) findViewById(R.id.button1);
		image=(ImageView) findViewById(R.id.imageresult);
		
		click.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0)
			{
				Intent camera_intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(camera_intent, RESULT_OK);
			}
		});
		
	}
 @Override
 	protected void onActivityResult(int requestCode, int resultCode, Intent data)
 	{
	 if(requestCode==RESULT_OK)
	 {
		 Bitmap bitmap= (Bitmap) data.getExtras().get("data");
		 image.setImageBitmap(bitmap);
	 }
	 else if(requestCode==RESULT_CANCELED)
	 {
		 Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
	 }
 	}	
}