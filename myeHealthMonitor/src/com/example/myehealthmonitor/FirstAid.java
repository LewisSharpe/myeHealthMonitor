package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstAid extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_aid);
		

		Button bites = (Button) findViewById(R.id.button1);
		bites.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetobites = new Intent(FirstAid.this,  AnimalBites.class);
				    startActivity(movetobites);	
			}

		});
		
		Button gums = (Button) findViewById(R.id.Button01);
		gums.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetogums = new Intent(FirstAid.this,  BleedingGums.class);
				    startActivity(movetogums);	
			}

		});
		Button heatstroke = (Button) findViewById(R.id.Button02);
		heatstroke.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoheatstroke = new Intent(FirstAid.this,  HeatStroke.class);
				    startActivity(movetoheatstroke);	
			}

		});
		Button toothache = (Button) findViewById(R.id.Button03);
		toothache.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetotoothache = new Intent(FirstAid.this,  Toothache.class);
				    startActivity(movetotoothache);	
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_first_aid, menu);
		return true;
	}

}
