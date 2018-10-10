package com.example.amirul.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Person> list;
    int type;
    final int GRID = 0;
    final int LIST = 1;


    public MyAdapter(List<Person> list, int type) {
        this.list = list;
        this.type = type;
    }


    // Inflating views if the existing layout items are not being recycled
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView;
        if(viewType == GRID){
            /*inflate the grid cell as a view item*/
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell,parent,false);
        }else {

           itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        }

        return new ViewHolder(itemView, viewType);
    }


    /*Adding data to your layout item*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder , int position) {

        Person person = list.get(position);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    /*Using the variable type to check which layout is to be displayed*/
    @Override
    public int getItemViewType(int position) {
         if(type == GRID){
             return GRID;
         }
         else {
             return LIST;
         }

    }

    /*Define holder inner class */

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        final int GRID = 0;
        final int LIST = 1;


        public ViewHolder(@NonNull View itemView, int type) {
            super(itemView);

            if (type == GRID){
                textView = (TextView) itemView.findViewById(R.id.textView2);
            }else {
                textView = (TextView) itemView.findViewById(R.id.textView);
            }

        }
    }
}
