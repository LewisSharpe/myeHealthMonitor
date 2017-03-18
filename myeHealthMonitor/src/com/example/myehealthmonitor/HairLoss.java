package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HairLoss extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hair_loss);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hair_loss, menu);
		return true;
	}

}
