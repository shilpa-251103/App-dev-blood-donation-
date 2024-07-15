package com.example.homepage;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<User> list;


    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user= list.get(position);
        holder.username.setText(user.getUsername());
        holder.bloodgroup.setText(user.getBloodgroup());
        holder.location.setText(user.getLocation());
        holder.number.setText(String.valueOf(user.getNumber()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }





    public void searchDataList(ArrayList<User> searchList){
        list = searchList;
        notifyDataSetChanged();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView username,bloodgroup,location,number;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            username=itemView.findViewById(R.id.username);
            location=itemView.findViewById(R.id.location);
            number=itemView.findViewById(R.id.number);
            bloodgroup=itemView.findViewById(R.id.bloodgroup);

        }
    }
}
