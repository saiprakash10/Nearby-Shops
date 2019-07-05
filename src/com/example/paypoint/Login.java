package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	EditText user,pass;
	Button log;
	TextView create;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		user=(EditText)findViewById(R.id.username);
		pass=(EditText)findViewById(R.id.password);
		log=(Button)findViewById(R.id.login);
		create=(TextView)findViewById(R.id.create);
		
		
		
		create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Login.this,CreateAcc.class);
				startActivity(intent);
			}
		});
		log.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String u1=user.getText().toString();
				String p1=pass.getText().toString();
				SharedPreferences sharedPreferences=getSharedPreferences("prefer",MODE_PRIVATE);
				String v1=sharedPreferences.getString("k3", "");
				String v2=sharedPreferences.getString("k2", "");
					if (u1.equals(v1)&&(p1.equals(v2))) {
						Intent intent=new Intent(Login.this,Welcome.class);
						startActivity(intent);
						Toast.makeText(Login.this, "Login success", Toast.LENGTH_SHORT).show();
					}
						else if (u1.isEmpty()) {
							Toast.makeText(Login.this,"enter username", Toast.LENGTH_SHORT).show();
						}
						else if (p1.isEmpty()) {
							Toast.makeText(Login.this,"enter password", Toast.LENGTH_SHORT).show();
						}
						else if (user.length()<10) {
							Toast.makeText(Login.this, "enter valid 10 digit number", Toast.LENGTH_LONG).show();
							
						}else{
							Toast.makeText(Login.this, "Invalid entry", Toast.LENGTH_LONG).show();
						}
					}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
