package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SC1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sc1);
		 Button next = (Button) findViewById(R.id.Button04);
		    next.setOnClickListener( new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent movetonext = new Intent(SC1.this,  SC2.class);
					    startActivity(movetonext);	
				}

			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sc1, menu);
		return true;
	}

}
