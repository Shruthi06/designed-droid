package com.shruthi.asynch_msg_demo;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class asynchdemo extends AsyncTask<Void, String, Void>
{
	TextView textview;
	
	public asynchdemo(TextView asynchtextview)
	{
		textview=asynchtextview;
	}
	
	@Override
	protected void onPreExecute() 
	{
		
		super.onPreExecute();
		textview.setText("Download in progress");
		//Toast.makeText(asynchdemo.this, "running onpreexecute()", Toast.LENGTH_SHORT).show();
		
	}


	@Override
	protected Void doInBackground(Void... arg0) 
	{
		Log.d("[DEBUG]","Starting Long Running Process");
		for (int i = 0; i <10; i++)
		{
			try 
			{
				Thread.sleep(200);
				publishProgress(String.valueOf(i));
				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
		
		return null;
	}
	
	@Override
	protected void onProgressUpdate(String... values) 
	{
		super.onProgressUpdate(values);
		textview.setText(""+values[0]+"% downloding completed");
	}
	
	@Override
	protected void onPostExecute(Void result)
	{
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		textview.setText("downloading completed");
	}
		
	

}
