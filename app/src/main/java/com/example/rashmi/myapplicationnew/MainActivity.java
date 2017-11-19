package com.example.rashmi.myapplicationnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerAdapter mAdapter;
RecyclerView.LayoutManager layoutManager;
String[] Name,Mdescription;
ArrayList<DataProvider> arrayList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=getResources().getStringArray(R.array.movies_name);
        Mdescription=getResources().getStringArray(R.array.Description);
        int i=0;
        for(String name:Name){
          DataProvider dataProvider=new DataProvider(name,Mdescription[i]);
          arrayList.add(dataProvider);
          i++;
        }
        mAdapter=new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
    }


}
