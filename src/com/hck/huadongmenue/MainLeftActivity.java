package com.hck.huadongmenue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainLeftActivity extends Fragment implements OnClickListener{
	private View view;
	private TextView mainLiftTextView;
	public static MainLeftActivity mActivity;
	private Button homeButton,profileButton,settingButton,notionButton,aboutButton,errorButton;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view=inflater.inflate(R.layout.mainleft, null);
		initView();
		mActivity=this;
		
		return view;
	}
   public void setDate(String size)
   {
	   mainLiftTextView.setText(size);
   }
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
	}
	
	private void initView()
	{
		homeButton=(Button) view.findViewById(R.id.n_home_bt);
		homeButton.setOnClickListener(this);
		profileButton=(Button) view.findViewById(R.id.n_profile_bt);
		profileButton.setOnClickListener(this);
		settingButton=(Button) view.findViewById(R.id.n_setting_bt);
		settingButton.setOnClickListener(this);
		notionButton=(Button) view.findViewById(R.id.n_ntf_bt);
		notionButton.setOnClickListener(this);
		aboutButton=(Button) view.findViewById(R.id.n_about_bt);
		aboutButton.setOnClickListener(this);
		errorButton=(Button) view.findViewById(R.id.n_error_bt);
		errorButton.setOnClickListener(this);
		mainLiftTextView=(TextView) view.findViewById(R.id.mainLeft_newSize);
		
	}

	@Override
	public void onClick(View v) {
         	switch (v.getId()) {
			case R.id.n_home_bt:
				
				break;
			case R.id.n_profile_bt:
				break;
			case R.id.n_setting_bt:
				break;
			case R.id.n_ntf_bt:
				break;
			case R.id.n_about_bt:
				break;
			case R.id.n_error_bt:
				break;
			default:
				break;
			}	
	}
	
}
