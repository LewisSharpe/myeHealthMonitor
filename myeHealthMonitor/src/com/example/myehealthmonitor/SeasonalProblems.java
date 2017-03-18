package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SeasonalProblems extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seasonal_problems);
		
		Button summer = (Button) findViewById(R.id.button1);
		summer.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetosummer = new Intent(SeasonalProblems.this,  Summer.class);
				    startActivity(movetosummer);	
			}

		});
		

		Button autumn = (Button) findViewById(R.id.Button01);
		autumn.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoautumn = new Intent(SeasonalProblems.this,  Autumn.class);
				    startActivity(movetoautumn);	
			}

		});

		Button winter = (Button) findViewById(R.id.Button02);
		winter.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetowinter = new Intent(SeasonalProblems.this,  Winter.class);
				    startActivity(movetowinter);	
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_seasonal_problems, menu);
		return true;
	}

}
