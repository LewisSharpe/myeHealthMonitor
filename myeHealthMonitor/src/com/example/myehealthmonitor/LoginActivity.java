package com.example.myehealthmonitor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
    // User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private Button bt_SignIn;
    // Message
    private TextView tv_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        MediaPlayer mp = MediaPlayer.create(this, R.raw.login);
		mp.start();
        
        // Initialization
        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_SignIn = (Button) findViewById(R.id.bt_SignIn);
        tv_Message = (TextView) findViewById(R.id.tv_Message);
        
        bt_SignIn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());
                
                // Validates the User name and Password for admin, admin
                if (username.equals("admin") && password.equals("admin")) {
                    tv_Message.setText("Login Successful!");
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
                // Validates the User name and Password for user, user
                if (username.equals("user") && password.equals("user")) {
                    tv_Message.setText("Login Successful!");
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
                if (username.equals("lewissharpe1") && password.equals("pars93")) {
                    tv_Message.setText("Login Successful!");
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
                if (username.equals("stevejones2") && password.equals("user2")) {
                    tv_Message.setText("Login Successful!");
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
            }
        });
    }

}


