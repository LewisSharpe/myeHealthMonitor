package com.example.myehealthmonitor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Advice extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_advice);
		
		 MediaPlayer mp = MediaPlayer.create(this, R.raw.advice);
		 mp.start();
		
		ImageButton selfcure;
		selfcure = (ImageButton) findViewById(R.id.imageButton1);
		 
		selfcure.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoSC = new Intent(Advice.this, SelfCure.class);
				    startActivity(movetoSC);	
			}
 
		});
		ImageButton SP;
		SP = (ImageButton) findViewById(R.id.imageButton2);
		 
		SP.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoSP = new Intent(Advice.this, SeasonalProblems.class);
				    startActivity(movetoSP);	
			}
 
		});
		ImageButton FirstAid;
	    FirstAid = (ImageButton) findViewById(R.id.imageButton3);
		 
	    FirstAid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoFirstAid = new Intent(Advice.this, FirstAid.class);
				    startActivity(movetoFirstAid);	
			}
 
		});
	    ImageButton GT;
	    GT = (ImageButton) findViewById(R.id.imageButton4);
		 
	    GT.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoGT = new Intent(Advice.this, GrannyTips.class);
				    startActivity(movetoGT);	
			}
 
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_advice, menu);
		return true;
	}

}
