package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Summary extends Activity {
	ImageView imgn;
	TextView txt1,txt2;
	Button pay;
	EditText idno;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_summary);
		imgn=(ImageView)findViewById(R.id.prod);
		txt1=(TextView)findViewById(R.id.pron);
		txt2=(TextView)findViewById(R.id.amnt);
		idno=(EditText)findViewById(R.id.idpay);
		pay=(Button)findViewById(R.id.pay);
		
		Intent in=getIntent();
		Bundle bun=in.getExtras();
		final String name=bun.getString("b1");
		final String amonut=bun.getString("b2");
		txt1.setText(name);;
		txt2.setText("Price :" +amonut);
		pay.setOnClickListener(new OnClickListener() {
			
     	@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
     		SharedPreferences preferences=getSharedPreferences("preper", MODE_PRIVATE);
			String s1=preferences.getString("c1", "");
			String s2=preferences.getString("c2", "");
			final String s3=preferences.getString("c3", "");
			String id=idno.getText().toString();
			
			if (s2.equals(id)) {
		
							int a1=Integer.parseInt(amonut);
							int a2=Integer.parseInt(s3);
							int bill=a1-a2;
							Toast.makeText(Summary.this,"RS:"+amonut+" Paid  success", Toast.LENGTH_LONG).show();
							Toast.makeText(Summary.this,"your remaining Balance:"+bill, Toast.LENGTH_LONG).show();
							SharedPreferences sharedPreferences=getSharedPreferences("prefer",MODE_PRIVATE);
							String ph=sharedPreferences.getString("k3", "");
							SmsManager manager=SmsManager.getDefault();
							manager.sendTextMessage(ph, null,"Hi "+s1+" your order " +name+" Rs:"+a1+" Your remaining balance is "+bill, null, null);
							Intent intent=new Intent(Summary.this,Rating.class);
							startActivity(intent);
							
			}
			else {
				
				Toast.makeText(Summary.this,"Invalid customer_id", Toast.LENGTH_SHORT).show();
			}
			
		
				final ProgressDialog progressDialog=new ProgressDialog(Summary.this);
				progressDialog.setTitle("Processing Payment...");
				progressDialog.setMessage("just a min!!!");
				progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
				progressDialog.setCancelable(false);
				progressDialog.show();
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							Thread.sleep(100000);
								
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						progressDialog.dismiss();
					}
				}).start();
				
			}
		});
		
		if (name.equals("Milk")) {
			imgn.setBackgroundResource(R.drawable.milk);
			
		}
		if (name.equals("Apple")) {
			imgn.setBackgroundResource(R.drawable.apple);
			
		}
		if (name.equals("Biscuits")) {
			imgn.setBackgroundResource(R.drawable.biscuits);
			
		}
		if (name.equals("Boost")) {
			imgn.setBackgroundResource(R.drawable.boost);
			
		}
		if (name.equals("Bread")) {
			imgn.setBackgroundResource(R.drawable.bread);
			
		}
		if (name.equals("Bru")) {
			imgn.setBackgroundResource(R.drawable.bru);
			
		}
		if (name.equals("Chocholate")) {
			imgn.setBackgroundResource(R.drawable.chocholate);
			
		}
		if (name.equals("Colgate")) {
			imgn.setBackgroundResource(R.drawable.colgate);
			
		}
		if (name.equals("Horlicks")) {
			imgn.setBackgroundResource(R.drawable.horlicks);
			
		}
		if (name.equals("Jam")) {
			imgn.setBackgroundResource(R.drawable.jam);
			
		}
		if (name.equals("Shampoo")) {
			imgn.setBackgroundResource(R.drawable.shampoo);
			
		}
		if (name.equals("Soap")) {
			imgn.setBackgroundResource(R.drawable.soap);
			
		}
		if (name.equals("Sugar")) {
			imgn.setBackgroundResource(R.drawable.sugar);
			
		}
		if (name.equals("Tea")) {
			imgn.setBackgroundResource(R.drawable.tea);
			
		}
		if (name.equals("7Up")) {
			imgn.setBackgroundResource(R.drawable.up7);
			

			
		
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.logout, menu);
		return true;
		
		
		
	}

}
