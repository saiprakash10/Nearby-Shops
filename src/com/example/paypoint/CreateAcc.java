package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAcc extends Activity {
EditText cusn,cusph,cusmail,cusadd,pass,conpass;
Button sub;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_acc);
		cusn=(EditText)findViewById(R.id.cusname);
		cusph=(EditText)findViewById(R.id.mobileno);
		cusmail=(EditText)findViewById(R.id.mail);
		cusadd=(EditText)findViewById(R.id.Address);
		pass=(EditText)findViewById(R.id.pass);
		conpass=(EditText)findViewById(R.id.conpass);
		sub=(Button)findViewById(R.id.Submit);
		
		sub.setOnClickListener(new OnClickListener() { 
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name=cusn.getText().toString();
				String phone=cusph.getText().toString();
				String mail=cusmail.getText().toString();
				String address=cusadd.getText().toString();
				String tpass=pass.getText().toString();
				String cpass=conpass.getText().toString();
				
				if ((name.isEmpty())&&(phone.isEmpty())&&(mail.isEmpty())&&(address.isEmpty())) {
					Toast.makeText(CreateAcc.this, "fill all the details", Toast.LENGTH_SHORT).show();
					
				}
				else if (phone.length()<10) {
					Toast.makeText(CreateAcc.this, "Enter valid 10 digit number", Toast.LENGTH_LONG).show();
					
				}
				else if (name.isEmpty()) {
					Toast.makeText(CreateAcc.this, "you missed username", Toast.LENGTH_SHORT).show();
				}
				else if (phone.isEmpty()) {
					Toast.makeText(CreateAcc.this, "you missed phone number", Toast.LENGTH_SHORT).show();
				}
				else if (mail.isEmpty()) {
					Toast.makeText(CreateAcc.this, "you missed mail", Toast.LENGTH_SHORT).show();
				}
				else if (address.isEmpty()) {
					Toast.makeText(CreateAcc.this, "you missed address", Toast.LENGTH_SHORT).show();
				}
				else if (tpass.equals(cpass)) {
					SharedPreferences sharedPreferences=getSharedPreferences("prefer",MODE_PRIVATE);
					SharedPreferences.Editor editor=sharedPreferences.edit();
					editor.putString("k1", name);
					editor.putString("k2", cpass);
					editor.putString("k3", phone);
					editor.commit();
					SmsManager smsManager=SmsManager.getDefault();
					smsManager.sendTextMessage(phone, null,"welcome to pay point mr/mrs "+name+" now you are an one of the member of pay point,have a happy shoping" , null, null);
					Toast.makeText(CreateAcc.this,"Register successfully", Toast.LENGTH_SHORT).show();
					Intent intent=new Intent(CreateAcc.this,Login.class);
					startActivity(intent);		
				}
				else {
					Toast.makeText(CreateAcc.this,"check your password", Toast.LENGTH_SHORT).show();
					
				}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_acc, menu);
		return true;
	}

}
