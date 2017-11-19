package com.example.rashmi.myapplicationnew;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by QCS2015 on 19-11-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private ArrayList<DataProvider> arrayList=new ArrayList<>();

    public RecyclerAdapter(ArrayList<DataProvider> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider dataProvider=arrayList.get(position);
        holder.movie_name.setText(dataProvider.getMovie_name());
        holder.description.setText(dataProvider.getDescription());


    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView movie_name,description;
            public RecyclerViewHolder(View itemView) {
            super(itemView);
            movie_name=itemView.findViewById(R.id.tv_Movie_name);
            description=itemView.findViewById(R.id.tv_Description);
        }
    }
}
