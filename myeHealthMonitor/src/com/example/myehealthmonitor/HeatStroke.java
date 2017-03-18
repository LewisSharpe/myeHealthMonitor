package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HeatStroke extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_heat_stroke);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_heat_stroke, menu);
		return true;
	}

}
