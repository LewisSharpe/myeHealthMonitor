package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class PhysicalHealth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_physical_health);
		ImageButton resp;
		resp = (ImageButton) findViewById(R.id.imageButton2);
		 
		resp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PackageManager pm = getPackageManager();
				Intent intent = pm.getLaunchIntentForPackage("net.simplyadvanced.vitalsigns");
				startActivity(intent);
			}
 
		});
		
		ImageButton heartrate;
		heartrate = (ImageButton) findViewById(R.id.imageButton6);
		 
		heartrate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PackageManager pm = getPackageManager();
				Intent intent = pm.getLaunchIntentForPackage("com.jwetherell.heart_rate_monitor");
				startActivity(intent);
			}
 
		});
		ImageButton bp;
		bp = (ImageButton) findViewById(R.id.imageButton4);
		
		bp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoPH = new Intent(PhysicalHealth.this, BloodPressure.class);
				    startActivity(movetoPH);
			}
 
		});
		
		ImageButton bp1;
		bp1 = (ImageButton) findViewById(R.id.imageButton10);
		
		bp1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PackageManager pm = getPackageManager();
				Intent intent = pm.getLaunchIntentForPackage("net.simplyadvanced.vitalsigns");
				startActivity(intent);
			}
 
		});
		

		ImageButton physical;
		physical = (ImageButton) findViewById(R.id.imageButton1);
		 
		physical.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoPH = new Intent(PhysicalHealth.this, TestOxygenSaturation.class);
				    startActivity(movetoPH);	
			}
 
		});
		ImageButton liver;
		liver = (ImageButton) findViewById(R.id.imageButton3);
		 
		liver.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoliver = new Intent(PhysicalHealth.this, LC.class);
				    startActivity(movetoliver);	
			}
 
		});
		ImageButton glucose;
		glucose = (ImageButton) findViewById(R.id.imageButton5);
		 
		glucose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoglucose = new Intent(PhysicalHealth.this, Glucose.class);
				    startActivity(movetoglucose);	
			}
 
		});
		
		ImageButton weight;
		weight = (ImageButton) findViewById(R.id.imageButton7);
		 
		weight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoweight = new Intent(PhysicalHealth.this, Weight.class);
				    startActivity(movetoweight);	
			}
 
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_physical_health, menu);
		return true;
	}

}
