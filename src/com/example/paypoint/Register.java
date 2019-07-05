package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity {
	EditText n,id,amt;
	Button pay;
	SQLiteDatabase sql;
	Cursor c;
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		n=(EditText)findViewById(R.id.payname);
		id=(EditText)findViewById(R.id.payid);
		amt=(EditText)findViewById(R.id.money);
		pay=(Button)findViewById(R.id.charge);
		Intent intent=getIntent();
		Bundle bun=intent.getExtras();
		final String b=bun.getString("id");
		sql=openOrCreateDatabase("pay.DB",MODE_PRIVATE, null);
		sql.execSQL("create table if not exists  payment(Customer_name varchar,Customer_Id varchar,amount varchar);");
		Toast.makeText(Register.this, "Add amonut your wallet", Toast.LENGTH_SHORT).show();
		sql.close();
		pay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String cus=n.getText().toString();
				String idno=id.getText().toString();
				String money=amt.getText().toString();
				
				if (b.equals(idno)) {
					sql=openOrCreateDatabase("pay.DB",MODE_PRIVATE, null);
					sql.execSQL("insert into payment values('"+cus+"','"+idno+"','"+money+"');");
					Toast.makeText(Register.this,"Recharge successfull", Toast.LENGTH_SHORT).show();
					
						c=sql.rawQuery("select * from payment where Customer_name='"+n.getText().toString()+"'", null);
						if (c!=null) {
							if (c.moveToFirst()) {
								do {
									String col0=c.getString(0);
									String col1=c.getString(1);
									String col2=c.getString(2);
									SharedPreferences preferences=getSharedPreferences("preper", MODE_PRIVATE);
									SharedPreferences.Editor editor=preferences.edit();
									editor.putString("c1", col0);
									editor.putString("c2", col1);
									editor.putString("c3", col2);
									editor.commit();
									Intent in=new Intent(Register.this,Purchase.class);
									startActivity(in);
					}while(c.moveToNext());
							}
						}
					}
								
				
				
				else {
					
					Toast.makeText(Register.this,"Invalid Customer_Id", Toast.LENGTH_SHORT).show();
				}	 
			}
		});
		
		
		
	}
				
			
			
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
