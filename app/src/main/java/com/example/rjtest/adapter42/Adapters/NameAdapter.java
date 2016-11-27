package com.example.rjtest.adapter42.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rjtest.adapter42.Model.custome;
import com.example.rjtest.adapter42.R;

import java.util.ArrayList;
import java.util.jar.Attributes;

/**
 * Created by RITESH on 9/15/2016.
 */
public class NameAdapter extends BaseAdapter {

    private ArrayList<custome> dummyData;

   private LayoutInflater mLayoutInflater;

    public NameAdapter(Context Context, ArrayList<custome> mDummydata) {

        dummyData = mDummydata;

        mLayoutInflater = LayoutInflater.from(Context);
    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        custome custome = (custome) getItem(position);

        convertView = mLayoutInflater.inflate(R.layout.activity_custome,parent,false);
        TextView Name= (TextView) convertView.findViewById(R.id.name);
        TextView Phone = (TextView) convertView.findViewById(R.id.phone);
        Name.setText(custome.getName());
        Phone.setText(String.valueOf(custome.getPhoneno()));

        return convertView;
    }

}
