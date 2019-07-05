package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Purchase extends Activity {
	
	ListView lists;
	String[] name={"Milk","Apple","Biscuits","Boost","Bread","Bru ","Chocholate","Colgate","Horlicks","Jam","Shampoo","Soap","Sugar","Tea","7up"};
	String[] price={"30","100","25","120","40","20","35","25","110","30","45","40","30","25","20"};
	int[] product={R.drawable.milk,R.drawable.apple,R.drawable.biscuits,R.drawable.boost,R.drawable.bread,R.drawable.bru,R.drawable.chocholate,R.drawable.colgate,R.drawable.horlicks,R.drawable.jam,R.drawable.shampoo,R.drawable.soap,R.drawable.sugar,R.drawable.tea,R.drawable.up7};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase);
		lists=(ListView)findViewById(R.id.list);
		CustomAdapter adap=new CustomAdapter(this, name, price, product);
		lists.setAdapter(adap);
		lists.setOnItemClickListener(new  OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long id) {
				// TODO Auto-generated method stub
				Bundle bun=new Bundle();
				bun.putString("b1", name[pos]);
				bun.putString("b2", price[pos]);
				Intent in=new Intent(Purchase.this,Summary.class);
				in.putExtras(bun);
				startActivity(in);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.purchase, menu);
		return true;
	}

}
