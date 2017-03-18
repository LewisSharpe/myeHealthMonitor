package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MentalHealth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mental_health);
		
		ImageButton stress;
		stress = (ImageButton) findViewById(R.id.imageButton2);
		 
		stress.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetostress = new Intent(MentalHealth.this, StressCheck.class);
				    startActivity(movetostress);	
			}
 
		});
		ImageButton mood;
		mood = (ImageButton) findViewById(R.id.imageButton1);
		 
		mood.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetomood = new Intent(MentalHealth.this, SC.class);
				    startActivity(movetomood);	
			}
 
		});
		ImageButton gmhqs;
		gmhqs = (ImageButton) findViewById(R.id.imageButton3);
		 
		gmhqs.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetogmhqs = new Intent(MentalHealth.this, GMHQs.class);
				    startActivity(movetogmhqs);	
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_mental_health, menu);
		return true;
	}

}
