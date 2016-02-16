package com.shruthi.service_demo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class Service_demo extends Service
{
	MediaPlayer mp;
	
	@Override
	public void onCreate() 
	{
		
		
		super.onCreate();
		mp=MediaPlayer.create(Service_demo.this, R.raw.gangam_style);
		//Toast.makeText(Service_demo.this, "inside oncreate() method", Toast.LENGTH_SHORT).show();
	}

	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		mp.start();
		//Toast.makeText(Service_demo.this, "inside onstartcommand() method", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public void onDestroy() 
	{
		//Toast.makeText(Service_demo.this, "inside ondestroy() method", Toast.LENGTH_SHORT).show();
		super.onDestroy();
		mp.stop();
	}
	
	
	
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}

}