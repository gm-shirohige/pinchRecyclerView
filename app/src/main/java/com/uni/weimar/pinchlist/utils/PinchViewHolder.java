package com.uni.weimar.pinchlist.utils;

import android.view.View;
import android.widget.TextView;

import com.uni.weimar.pinchlist.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PinchViewHolder extends RecyclerView.ViewHolder implements isExpandable {

    int nestedListHeight = 0;
    TextView tv;
    PinchList pv;


    /**
     * If viewHolder can be expanded, then add nested RV for Pinch output
     * @param itemView
     */

    public PinchViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.text_item);
        pv = itemView.findViewById(R.id.sub_list);
    }



    public void expandList(int pixelGrowth){
        String[] productCategories = {
                "Sports",
                "Clothing",
                "Electronics",
                "Groceries",
                "Utilities",
                "Home Appliances",
                "Sports",
                "Clothing",
                "Electronics",
                "Groceries",
                "Utilities",
                "Home Appliances",
                "Sports",
                "Clothing",
                "Electronics",
                "Groceries",
                "Utilities",
                "Home Appliances",
        };
        pv.setHasFixedSize(false);
        pv.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        pv.setPinchableAdapter(new PinchAdapter(productCategories));
        pv.setVisibility(View.VISIBLE);
        tv.setText(tv.getText() + " Expanded");
        pv.setMinimumHeight(300);
        pv.setMinimumWidth(300);
    }

}
