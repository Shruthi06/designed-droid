package com.shruthi.static_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_activity extends Fragment
{
 @Override
 		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
 		{
			return inflater.inflate(R.layout.fragment, container);
 		}
}
