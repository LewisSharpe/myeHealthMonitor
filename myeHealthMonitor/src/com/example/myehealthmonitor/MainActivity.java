package com.example.myehealthmonitor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("DISCLAIMER:");
    	builder.setMessage("This mobile application is intended to be a supplement to doctor-patient interaction. For any serious medical issues see your GP. Press yes if you agree to the disclaimer, if you don't agree to the disclaimer, press no and you will exit the application subsquently. ");
    	builder.setIcon(android.R.drawable.alert_dark_frame);
    	builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    	    public void onClick(DialogInterface dialog, int which) {			      	
    	    	//Yes button clicked, do something
    	    	Toast.makeText(MainActivity.this, "Patient has agreed to the disclaimer.", 
                               Toast.LENGTH_SHORT).show();
    	    }
    	});
    	builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
    	    public void onClick(DialogInterface dialog, int which) {			      	
    	    	//Yes button clicked, do something
    	    	Intent intent = new Intent(Intent.ACTION_MAIN);
    	    	intent.addCategory(Intent.CATEGORY_HOME);
    	    	intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	    	startActivity(intent);
    	    	Toast.makeText(MainActivity.this, "Exit. Goodbye!.", 
                               Toast.LENGTH_SHORT).show();
    	    }
    	});					//Do nothing on no
    	builder.show();
		MediaPlayer mp = MediaPlayer.create(this, R.raw.welcomeaudio);
		mp.start();
		TextView textView = (TextView) findViewById(R.id.textView2);
		textView.setText(DateUtils.formatDateTime(MainActivity.this, System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_12HOUR));
		
		ImageButton physical;
		physical = (ImageButton) findViewById(R.id.imageButton1);
		 
		physical.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoPH = new Intent(MainActivity.this, PhysicalHealth.class);
				    startActivity(movetoPH);	
			}
 
		});
		
		ImageButton mental;
		mental = (ImageButton) findViewById(R.id.imageButton2);
		 
		mental.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoMH = new Intent(MainActivity.this, MentalHealth.class);
				    startActivity(movetoMH);	
			}
 
		});
		ImageButton advice;
		advice = (ImageButton) findViewById(R.id.imageButton3);
		 
		advice.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoAdvice = new Intent(MainActivity.this, Advice.class);
				    startActivity(movetoAdvice);	
			}
 
		});
		ImageButton reglogin;
		reglogin = (ImageButton) findViewById(R.id.imageButton4);
		 
		reglogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoreglogin = new Intent(MainActivity.this,  LoginActivity.class);
				    startActivity(movetoreglogin);	
			}
 
		});
		ImageButton userguide;
		userguide = (ImageButton) findViewById(R.id.imageButton5);
		 
		userguide.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetouserguide = new Intent(MainActivity.this,  UserGuide.class);
				    startActivity(movetouserguide);	
			}
 
		});
		ImageButton rate;
		rate = (ImageButton) findViewById(R.id.imageButton6);
		 
		rate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetorateapp = new Intent(MainActivity.this,  RateApp.class);
				    startActivity(movetorateapp);	
			}
 
		});

		Button notifications = (Button) findViewById(R.id.button1);
		notifications.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetonotifications = new Intent(MainActivity.this,  Notifications.class);
				    startActivity(movetonotifications);	
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
