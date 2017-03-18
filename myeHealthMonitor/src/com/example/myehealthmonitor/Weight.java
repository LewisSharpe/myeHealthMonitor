package com.example.myehealthmonitor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Weight extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
		MediaPlayer mp = MediaPlayer.create(this, R.raw.weight);
		mp.start();
		 Button button = (Button) findViewById(R.id.Button01);
	        button.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                // Perform action on click   

	            	 Toast.makeText(getApplicationContext(), "Thanks for the health values provided. Your responses will be sent to your responsible physician.", 
	               		   Toast.LENGTH_SHORT).show();
	            }
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_weight, menu);
		return true;
	}

}
