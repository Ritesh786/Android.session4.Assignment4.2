package com.example.rjtest.adapter42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rjtest.adapter42.Adapters.NameAdapter;
import com.example.rjtest.adapter42.Model.custome;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
  private ListView mlistview;
    private ArrayList<custome> mDummydata;
    private NameAdapter  mNameAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistview = (ListView) findViewById(R.id.ritesh);


        mDummydata=new ArrayList<>();
        custome c1 = new custome("Ritesh",741575342);
        custome c2 = new custome("Rahul",769676998);
        custome c3 = new custome("Rajesh",66586586);
        custome c4 = new custome("Rohit",776868679);
        custome c5 = new custome("Rohan",868698698);
        custome c6 = new custome("Ramesh",675875898);
        custome c7 = new custome("Ranu",765876586);

        mDummydata.add(c1);
        mDummydata.add(c2);
        mDummydata.add(c3);
        mDummydata.add(c4);
        mDummydata.add(c5);
        mDummydata.add(c6);
        mDummydata.add(c7);

        mNameAdapter = new NameAdapter(getApplicationContext(),mDummydata);

        mlistview.setAdapter(mNameAdapter);

        mlistview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

     custome custome = mDummydata.get(position);
        Toast.makeText(MainActivity.this,"clicked on "+custome.getName(),Toast.LENGTH_SHORT).show();
    }
}
