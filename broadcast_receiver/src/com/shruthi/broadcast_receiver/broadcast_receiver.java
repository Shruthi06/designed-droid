package com.shruthi.broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcast_receiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context arg0, Intent arg1) 
	{
		Toast.makeText(arg0, "mode has been changed", Toast.LENGTH_SHORT).show();
	}

}
