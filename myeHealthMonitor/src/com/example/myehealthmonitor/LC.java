package com.example.myehealthmonitor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lc);
		
		MediaPlayer mp = MediaPlayer.create(this, R.raw.livercheck);
		mp.start();
		
		 Button next = (Button) findViewById(R.id.button1);
		    next.setOnClickListener( new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent movetonext = new Intent(LC.this,  LC1.class);
					    startActivity(movetonext);	
					    
					    
				}

			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_lc, menu);
		return true;
	}

}
