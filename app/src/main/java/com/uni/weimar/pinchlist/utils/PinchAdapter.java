package com.uni.weimar.pinchlist.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uni.weimar.pinchlist.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PinchAdapter extends RecyclerView.Adapter<PinchViewHolder> {
    public String[] provider;


    public PinchAdapter(String[] names){
        this.provider = names;
    }

    @NonNull
    @Override
    public PinchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        PinchViewHolder vh = new PinchViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PinchViewHolder holder, int position) {
        holder.tv.setText(provider[position]);
    }

    @Override
    public int getItemCount() {
        return provider.length;
    }
}
