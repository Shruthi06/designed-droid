package com.shruthi.multipane_fragment;

import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends Activity implements communicator {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if(findViewById(R.id.fragment_container)!=null)
		{
			List_Version list=new List_Version();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction trans=fm.beginTransaction();
			trans.add(R.id.fragment_container,list);
			trans.commit();
		}
	}

	@Override
	public void respond(int position)
	{
		Description_Version desc_frag= (Description_Version) getFragmentManager().findFragmentById(R.id.fragment_description);
		if(desc_frag!=null)
		{
			desc_frag.recieve_position(position);
		}
		else
		{
			Description_Version desc= new Description_Version();
			Bundle arg=new Bundle();
			arg.putInt("position", position);
			desc.setArguments(arg);
			FragmentManager fm=getFragmentManager();
			FragmentTransaction trans=fm.beginTransaction();
			trans.replace(R.id.fragment_container, desc);
			trans.addToBackStack(null);
			trans.commit();
		}
	}

}
