package com.hck.huadongmenue;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
public class MainRightActivity extends Fragment implements OnClickListener {
	private View view;
	private Button measuringButton, coachingButton, friendsButton,
			remoteButton, loutOutButton;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.mainright, null);
		initView();
		return view;
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	private void initView() {
		measuringButton = (Button) view.findViewById(R.id.r_measuring_bt);
		measuringButton.setOnClickListener(this);
		coachingButton = (Button) view.findViewById(R.id.r_coaching_bt);
		coachingButton.setOnClickListener(this);
		friendsButton = (Button) view.findViewById(R.id.r_friends_bt);
		friendsButton.setOnClickListener(this);
		remoteButton = (Button) view.findViewById(R.id.r_remote_bt);
		remoteButton.setOnClickListener(this);
		loutOutButton = (Button) view.findViewById(R.id.r_logout_bt);
		loutOutButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
	}

}
