package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Nearbyshop extends Activity {
	ImageView img1,img2,img3,img4,img5;
	final int id1= 1008;
	final int id2= 2007;
	final int id3= 1056;
	final int id4= 2078;
	final int id5= 4367;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nearbyshop);
		img1=(ImageView)findViewById(R.id.jeevan);
		img2=(ImageView)findViewById(R.id.grace);
		img3=(ImageView)findViewById(R.id.nilgiris);
		img4=(ImageView)findViewById(R.id.srivenkatesh);
		img5=(ImageView)findViewById(R.id.reliance);
		img1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder=new Builder(Nearbyshop.this);
				builder.setTitle("Jeevan super market");
				builder.setIcon(R.drawable.alert_selected);
				builder.setPositiveButton("RC wallet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						final ProgressDialog progressDialog = new ProgressDialog(Nearbyshop.this);
		                progressDialog.setMessage("welcome to jeevan supermarket"); // Setting Message
		                progressDialog.setTitle("Just a min"); // Setting Title
		                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
		                progressDialog.show(); // Display Progress Dialog
		                progressDialog.setCancelable(false);
		                new Thread(new Runnable() {
		                    public void run() {
		                        try {
		                        	SharedPreferences sharedPreferences=getSharedPreferences("prefer", MODE_PRIVATE);
		                        	String name=sharedPreferences.getString("k1", "");
		                        	String num=sharedPreferences.getString("k3", "");
		                        	Bundle bun=new Bundle();
		                        	bun.putString("id", String.valueOf(id1));
		                            SmsManager smsManager=SmsManager.getDefault();
		                            smsManager.sendTextMessage(num, null,"Hello "+name+ " your customer id is " +id1, null, null);
		                            Intent intent=new Intent(Nearbyshop.this,Register.class);
		                            intent.putExtras(bun);
		                            startActivity(intent);
		                            Thread.sleep(1000);
		                          
		                        } catch (Exception e) {
		                            e.printStackTrace();
		                        }
		                        progressDialog.dismiss();
		                    }
		                }).start();
					}
				});
				builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finish();
					}
				});
				 AlertDialog alert = builder.create();  
			        //Setting the title manually  
			        alert.show();  
				
				
				
			}
		});
		img2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder=new Builder(Nearbyshop.this);
				builder.setTitle("grace super market");
				builder.setIcon(R.drawable.alert_selected);
				builder.setPositiveButton("RC wallet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						final ProgressDialog progressDialog = new ProgressDialog(Nearbyshop.this);
		                progressDialog.setMessage("welcome to grace supermarket"); // Setting Message
		                progressDialog.setTitle("Just a min"); // Setting Title
		                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
		                progressDialog.show(); // Display Progress Dialog
		                progressDialog.setCancelable(false);
		                new Thread(new Runnable() {
		                    public void run() {
		                        try {
		                        	SharedPreferences sharedPreferences=getSharedPreferences("prefer", MODE_PRIVATE);
		                        	String name=sharedPreferences.getString("k1", "");
		                        	String num=sharedPreferences.getString("k3", "");
		                        	Bundle bun=new Bundle();
		                        	bun.putString("id", String.valueOf(id2));
		                            Thread.sleep(1000);
		                            SmsManager smsManager=SmsManager.getDefault();
		                            smsManager.sendTextMessage(num, null,"Hello "+name+ " your customer id is " +id2, null, null);
		                            Intent intent=new Intent(Nearbyshop.this,Register.class);
		                            intent.putExtras(bun);

		                            startActivity(intent);
		                          
		                        } catch (Exception e) {
		                            e.printStackTrace();
		                        }
		                        progressDialog.dismiss();
		                    }
		                }).start();
					}
				});
				builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finish();
						
					}
				});
				 AlertDialog alert = builder.create();  
			        //Setting the title manually  
			        alert.show();  
			}
		});
		img3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder=new Builder(Nearbyshop.this);
				builder.setTitle("nilgiris super market");
				builder.setIcon(R.drawable.alert_selected);
				builder.setPositiveButton("RC wallet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						final ProgressDialog progressDialog = new ProgressDialog(Nearbyshop.this);
		                progressDialog.setMessage("welcome to nilgiris supermarket"); // Setting Message
		                progressDialog.setTitle("Just a min"); // Setting Title
		                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
		                progressDialog.show(); // Display Progress Dialog
		                progressDialog.setCancelable(false);
		                new Thread(new Runnable() {
		                    public void run() {
		                        try {
		                        	SharedPreferences sharedPreferences=getSharedPreferences("prefer", MODE_PRIVATE);
		                        	String name=sharedPreferences.getString("k1", "");
		                        	String num=sharedPreferences.getString("k3", "");
		                        	Bundle bun=new Bundle();
		                        	bun.putString("id", String.valueOf(id3));
		                            Thread.sleep(1000);
		                            SmsManager smsManager=SmsManager.getDefault();
		                            smsManager.sendTextMessage(num, null,"Hello "+name+ " your customer id is " +id3, null, null);
		                            Intent intent=new Intent(Nearbyshop.this,Register.class);
		                            intent.putExtras(bun);

		                            startActivity(intent);
		                          
		                        } catch (Exception e) {
		                            e.printStackTrace();
		                        }
		                        progressDialog.dismiss();
		                    }
		                }).start();
					}
				});
				builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finish();
						
					}
				});
				 AlertDialog alert = builder.create();  
			        //Setting the title manually  
			        alert.show();  
				
			}
		});
		img4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder=new Builder(Nearbyshop.this);
				builder.setTitle("sri venkateshwara super market");
				builder.setIcon(R.drawable.alert_selected);
				builder.setPositiveButton("RC wallet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						final ProgressDialog progressDialog = new ProgressDialog(Nearbyshop.this);
		                progressDialog.setMessage("welcome to sri  venkateshwara supermarket"); // Setting Message
		                progressDialog.setTitle("Just a min"); // Setting Title
		                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
		                progressDialog.show(); // Display Progress Dialog
		                progressDialog.setCancelable(false);
		                new Thread(new Runnable() {
		                    public void run() {
		                        try {
		                        	SharedPreferences sharedPreferences=getSharedPreferences("prefer", MODE_PRIVATE);
		                        	String name=sharedPreferences.getString("k1", "");
		                        	String num=sharedPreferences.getString("k3", "");
		                        	Bundle bun=new Bundle();
		                        	bun.putString("id", String.valueOf(id4));
		                            Thread.sleep(1000);
		                            SmsManager smsManager=SmsManager.getDefault();
		                            smsManager.sendTextMessage(num, null,"Hello "+name+ " your customer id is " +id4, null, null);
		                            Intent intent=new Intent(Nearbyshop.this,Register.class);
		                            intent.putExtras(bun);

		                            startActivity(intent);
		                          
		                        } catch (Exception e) {
		                            e.printStackTrace();
		                        }
		                        progressDialog.dismiss();
		                    }
		                }).start();
					}
				});
				builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finish();
					}
				});
				 AlertDialog alert = builder.create();  
			        //Setting the title manually  
			        alert.show();  
				
			}
		});
		
		img5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder=new Builder(Nearbyshop.this);
				builder.setTitle("Reliance super market");
				builder.setIcon(R.drawable.alert_selected);
				builder.setPositiveButton("RC wallet", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						final ProgressDialog progressDialog = new ProgressDialog(Nearbyshop.this);
		                progressDialog.setMessage("welcome to Reliance supermarket"); // Setting Message
		                progressDialog.setTitle("Just a min"); // Setting Title
		                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
		                progressDialog.show(); // Display Progress Dialog
		                progressDialog.setCancelable(false);
		                new Thread(new Runnable() {
		                    public void run() {
		                        try {
		                        	SharedPreferences sharedPreferences=getSharedPreferences("prefer", MODE_PRIVATE);
		                        	String name=sharedPreferences.getString("k1", "");
		                        	String num=sharedPreferences.getString("k3", "");
		                        	Bundle bun=new Bundle();
		                        	bun.putString("id", String.valueOf(id5));
		                            Thread.sleep(1000);
		                            SmsManager smsManager=SmsManager.getDefault();
		                            smsManager.sendTextMessage(num, null,"Hello "+name+ " your customer id is " +id5, null, null);
		                            Intent intent=new Intent(Nearbyshop.this,Register.class);
		                            intent.putExtras(bun);

		                            startActivity(intent);
		                          
		                        } catch (Exception e) {
		                            e.printStackTrace();
		                        }
		                        progressDialog.dismiss();
		                    }
		                }).start();
					}
				});
				builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finish();
						
					}
				});
				 AlertDialog alert = builder.create();  
			        //Setting the title manually  
			        alert.show();  
				
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nearbyshop, menu);
		return true;
	}

}
