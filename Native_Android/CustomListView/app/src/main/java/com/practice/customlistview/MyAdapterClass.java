package com.practice.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapterClass extends ArrayAdapter<String> {
    private final Activity context;
    private final int[] image;
    private final String[] Username;
    private final String[] phoneNumber;

    //Alt+Shift+insert ------> create only default Constructor
    public MyAdapterClass(Activity context, int[] image, String[] username, String[] phoneNumber) {
        super(context, R.layout.one_item_layout,username);
        this.context = context;
        this.image = image;
        Username = username;
        this.phoneNumber = phoneNumber;
    }

    //We need to create a getView(View view) method

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.one_item_layout,null,true);
        TextView UserNum=rowView.findViewById(R.id.textView1);
        TextView MobileNum=rowView.findViewById(R.id.textView2);
        ImageView imgView=rowView.findViewById(R.id.imageView);
        UserNum.setText(Username[position]);
        MobileNum.setText(phoneNumber[position]);
        imgView.setImageResource(image[position]);
        return rowView;
    }
}
