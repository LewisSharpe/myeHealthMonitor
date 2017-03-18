package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GrannyTips extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_granny_tips);
		
		Button crackedheels = (Button) findViewById(R.id.button1);
		crackedheels.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetocrackedheels = new Intent(GrannyTips.this,  CrackedHeels.class);
				    startActivity(movetocrackedheels);	
			}

		});
		
		Button cold = (Button) findViewById(R.id.Button01);
		cold.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetocold = new Intent(GrannyTips.this,  Cold.class);
				    startActivity(movetocold);	
			}

		});
		
		Button dandruff = (Button) findViewById(R.id.Button02);
	    dandruff.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetodandruff = new Intent(GrannyTips.this,  Dandruff.class);
				    startActivity(movetodandruff);	
			}

		});
	    Button healthyhair = (Button) findViewById(R.id.Button03);
	    healthyhair.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetohealthyhair = new Intent(GrannyTips.this,  HealthyHair.class);
				    startActivity(movetohealthyhair);	
			}

		});
	    
	    Button hairloss = (Button) findViewById(R.id.Button04);
	    hairloss.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetohairloss = new Intent(GrannyTips.this,  HairLoss.class);
				    startActivity(movetohairloss);	
			}

		});
	    
	    Button skincare = (Button) findViewById(R.id.Button05);
	    skincare.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoskincare = new Intent(GrannyTips.this,  SkinCare.class);
				    startActivity(movetoskincare);	
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_granny_tips, menu);
		return true;
	}

}
