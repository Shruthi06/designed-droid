package com.shruthi.multipane_fragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_Version extends ListFragment
{
	public void onActivityCreated(Bundle savedInstanceState) 
	{
		
		super.onActivityCreated(savedInstanceState);
		
		
		String[] versions = {"v1","v2","v3","v4"};
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,versions);
		
		setListAdapter(adapter);
	
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) 
	
	{
	
		communicator communicator = (communicator) getActivity();
		
		communicator.respond(position);
	
	}

}
