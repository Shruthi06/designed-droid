package com.shruthi.instance_service_demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class service extends Service
{

	@Override
	public void onCreate() 
	{
		super.onCreate();
		Toast.makeText(service.this, "running onCreate() method", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId)
	{
		Toast.makeText(service.this, "running onStartCommand() method", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
		
	}
	
	@Override
	public void onDestroy() 
	{
		super.onDestroy();
		Toast.makeText(service.this, "running ondestroy() method", Toast.LENGTH_SHORT).show();
	}	
	
	
	
	@Override
	public IBinder onBind(Intent arg0) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
