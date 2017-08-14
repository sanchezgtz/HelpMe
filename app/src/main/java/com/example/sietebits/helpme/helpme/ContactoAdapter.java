package com.example.sietebits.helpme.helpme;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rsanchezgu on 11/08/2017.
 */

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.SimpleViewHolder>  {

    private String[] dataSource;

    public ContactoAdapter(String[] dataArgs){
        dataSource = dataArgs;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = new TextView(parent.getContext());
        SimpleViewHolder viewHolder = new SimpleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.textView.setText(dataSource[position]);
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public SimpleViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView;
            textView.setTextSize(22);

        }
    }
}
