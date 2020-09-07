package com.uni.weimar.pinchlist.utils;

import android.view.View;
import android.widget.TextView;

import com.uni.weimar.pinchlist.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PinchViewHolder extends RecyclerView.ViewHolder implements isExpandable {

    int nestedListHeight = 0;
    TextView tv;


    /**
     * If viewHolder can be expanded, then add nested RV for Pinch output
     * @param itemView
     */

    public PinchViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.text_item);
    }



    public void expandList(int pixelGrowth){
        tv.setText(tv.getText() + " Expanded");
        tv.setHeight(500);
        tv.setBackgroundColor(333);
    }

}
