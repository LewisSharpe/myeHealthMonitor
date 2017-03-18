package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RegLogIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reg_log_in);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_reg_log_in, menu);
		return true;
	}

}
