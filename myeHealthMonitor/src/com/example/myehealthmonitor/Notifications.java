package com.example.myehealthmonitor;

import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Notifications extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifications);
		
		TextView textView = (TextView) findViewById(R.id.textView2);
		
		SQLiteDatabase database = openOrCreateDatabase("DoctorAction.db", MODE_PRIVATE, null);
		database.execSQL("create table if not exists sampletable (date text, docno text, docname text, regarding text, action text)");
        database.execSQL("insert into sampletable values('01/02/2015', '5565', 'Dr Michael Ross', 'Regarding the Glucose Measurement', 'Action - come in for an appointment')");     	
	    Cursor cursor = database.rawQuery("select * from sampletable", null);
	    cursor.moveToFirst();
	    
	    String date = cursor.getString(0);
	    String docno = cursor.getString(1);
	    String docname = cursor.getString(2);
	    String regarding = cursor.getString(3);
	    String action = cursor.getString(4);
	    
	    textView.setText(date + "\n" + docno + "\n" + docname +  "\n" + regarding +  "\n" + action);
	    
	    database.close();
	    
	    Button button = (Button) findViewById(R.id.Button01);
        button.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View v) {

        		TextView textView = (TextView) findViewById(R.id.textView3);
        		
        		SQLiteDatabase database = openOrCreateDatabase("DoctorAction2.db", MODE_PRIVATE, null);
        		database.execSQL("create table if not exists sampletable (date text, docno text, docname text, regarding text, action text)");
                database.execSQL("insert into sampletable values('04/02/2015', '5568', 'Dr Colin Firth', 'Regarding the liver check questionnaire and heart rate Measurement', 'Action - come in to collect pre prescription.')");     	
        	    Cursor cursor = database.rawQuery("select * from sampletable", null);
        	    cursor.moveToFirst();
        	    
        	    String date = cursor.getString(0);
        	    String docno = cursor.getString(1);
        	    String docname = cursor.getString(2);
        	    String regarding = cursor.getString(3);
        	    String action = cursor.getString(4);
        	    
        	    textView.setText(date + "\n" + docno + "\n" + docname +  "\n" + regarding +  "\n" + action);
        	    
        	    database.close();
            }
        });
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_notifications, menu);
		return true;
	}

}
