package com.example.paypoint;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Rating extends Activity {
	RatingBar bar;
	TextView Rateview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating);
		bar=(RatingBar)findViewById(R.id.ratingBar1);
		Rateview=(TextView)findViewById(R.id.rate);
		bar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				// TODO Auto-generated method stub
				Rateview.setText(String.valueOf("Rating : "+bar.getRating()));
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.logout, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.log:
			finishAffinity();
			break;
		case R.id.feedback:
			Intent in=new Intent(this,Feedback.class);
			this.startActivity(in);
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	
		
		
	}

}
