package com.example.myehealthmonitor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class SelfCure extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_self_cure);
		
		Button acid = (Button) findViewById(R.id.button1);
		acid.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoacid = new Intent(SelfCure.this,  Acidity.class);
				    startActivity(movetoacid);	
			}
 
		});
		Button worms = (Button) findViewById(R.id.Button01);
		worms.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent movetoworms = new Intent(SelfCure.this,  Worms.class);
				    startActivity(movetoworms);	
			}
 
		});
		
	Button gastritis = (Button) findViewById(R.id.Button02);
	gastritis.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetogastritis = new Intent(SelfCure.this,  Gastritis.class);
			    startActivity(movetogastritis);	
		}

	});
	Button nosebleeding = (Button) findViewById(R.id.Button03);
	nosebleeding.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetonosebleeding = new Intent(SelfCure.this,  NoseBleeding.class);
			    startActivity(movetonosebleeding);	
		}

	});
	Button acne = (Button) findViewById(R.id.Button04);
	acne.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetoacne = new Intent(SelfCure.this,  Acne.class);
			    startActivity(movetoacne);	
		}

	});
	Button ulcers = (Button) findViewById(R.id.Button05);
	ulcers.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetoulcers = new Intent(SelfCure.this,  Ulcers.class);
			    startActivity(movetoulcers);	
		}

	});
	Button eczema = (Button) findViewById(R.id.Button06);
	eczema.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetoeczema = new Intent(SelfCure.this,  Eczema.class);
			    startActivity(movetoeczema);	
		}

	});
	
	Button gas = (Button) findViewById(R.id.Button07);
	gas.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetogas = new Intent(SelfCure.this,  Gas.class);
			    startActivity(movetogas);	
		}

	});
	Button sinusitis = (Button) findViewById(R.id.Button08);
	sinusitis.setOnClickListener( new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Intent movetosinusitis = new Intent(SelfCure.this,  Sinusitis.class);
			    startActivity(movetosinusitis);	
		}

	});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_self_cure, menu);
		return true;
	}

}
