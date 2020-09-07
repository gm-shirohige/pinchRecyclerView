package com.uni.weimar.pinchlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.uni.weimar.pinchlist.utils.PinchAdapter;
import com.uni.weimar.pinchlist.utils.PinchList;

public class MainActivity extends AppCompatActivity {
    private PinchList.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        PinchList list = findViewById(R.id.pinchlist);
        list.setHasFixedSize(false);
        layoutManager = new LinearLayoutManager(this);
        list.setLayoutManager(layoutManager);
        PinchAdapter adap = new PinchAdapter(productCategories);
        list.setPinchableAdapter(adap);
        
    }


}