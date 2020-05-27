package com.shuralev.laba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.Vector;

public class SecondActivity extends AppCompatActivity {

    RecyclerView rec;
    Vector<String> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rec = (RecyclerView) findViewById(R.id.recycler);
        rec.setLayoutManager(new LinearLayoutManager(this));

        numbers = new Vector<String>();
        for(int i=1;i<1000000;i++) numbers.add(Numbers.toString(i));

        NewAdapter newAdapter = new NewAdapter(numbers);
        rec.setAdapter(newAdapter);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ((RecyclerView)findViewById(R.id.recycler)).setLayoutManager(null);
        numbers.clear();

    }
}

