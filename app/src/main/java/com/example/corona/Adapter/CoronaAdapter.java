package com.example.corona.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.corona.Main.Main;
import com.example.corona.Main.Post;
import com.example.corona.R;

import java.util.ArrayList;
import java.util.List;

public class CoronaAdapter extends RecyclerView.Adapter<CoronaAdapter.CoronaViewHolder> {
    private List<Post> mPostList; // ?

    public CoronaAdapter( List<Post> posts){

        mPostList = posts;// ?
    }

    @NonNull
    @Override
    public CoronaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item , parent , false);
        return new CoronaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CoronaViewHolder holder, int position) {
        Post currentItem = mPostList.get(position); // ??
        holder.setData(currentItem);
    }

    @Override
    public int getItemCount() {

        return mPostList.size();
    }

     static class CoronaViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public TextView textView2;
        public TextView textView3;
        public TextView textView4;
        public TextView textView5;
        public TextView textView6;
        public TextView textView7;

        public CoronaViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview);
            textView2 = itemView.findViewById(R.id.textview2);
            textView3 = itemView.findViewById(R.id.textview3);
            textView4 = itemView.findViewById(R.id.textview4);
            textView5 = itemView.findViewById(R.id.textview5);
            textView6 = itemView.findViewById(R.id.textview6);
            textView7 = itemView.findViewById(R.id.textview7);
        }

        public void setData(Post item) {
            textView.setText(String.format("Country :%s", item.getMain()));
            textView2.setText(String.format("Total Cases :%s", item.getTotalCases()));
            textView3.setText(String.format("New Cases :%s", item.getNewCases()));
            textView4.setText(String.format("Total Deaths :%s", item.getTotalDeaths()));
            textView5.setText(String.format("New Deaths :%s", item.getNewDeaths()));
            textView6.setText(String.format("Total Recovered :%s", item.getTotalRecovered()));
            textView7.setText("Active Cases :" + item.getActiveCases());
        }
    }
}
