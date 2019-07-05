package com.example.paypoint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {
	
	String[] name;
	String[] price;
	int[]  product; 
	LayoutInflater inflater;
	Context context;

	public CustomAdapter(Context context, String name[],String[] price,int[] Product) {
		super(context,R.layout.customlist,name);
		// TODO Auto-generated constructor stub
		this.product=Product;
		this.price=price;
		this.name=name;
		this.context=context;
	}
	
	public class ViewHolder{
		TextView text;
		TextView proname;
		ImageView image;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView==null) {
			inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView =inflater.inflate(R.layout.customlist, null);	
		}
		
		final ViewHolder holder = new ViewHolder();
		holder.text = (TextView) convertView.findViewById(R.id.cost);
		holder.image = (ImageView) convertView.findViewById(R.id.img);
		holder.proname=(TextView)convertView.findViewById(R.id.proname);
		holder.text.setText("Cost :" +price[position]);
		holder.proname.setText(name[position]);
		holder.image.setImageResource(product[position]);
		return convertView;
		
		
	}

}
