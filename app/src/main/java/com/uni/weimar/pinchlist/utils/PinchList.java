package com.uni.weimar.pinchlist.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class PinchList extends RecyclerView {
    private ScaleGestureDetector mScaleDetector;


    public PinchList(@NonNull Context context) {
        super(context);
        mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
    }

    public PinchList(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
    }

    public PinchList(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            return true;
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            View v = PinchList.this.findChildViewUnder(detector.getFocusX(), detector.getFocusY());
            ViewHolder vh = PinchList.this.getChildViewHolder(v);


            if( vh instanceof PinchViewHolder) ((PinchViewHolder)vh).expandList(1);
            return super.onScaleBegin(detector);
        }
    }


    @Override
    public void setAdapter(@Nullable Adapter adapter) {
        // Old recycler View Behavior
        super.setAdapter(adapter);
    }

    public void setPinchableAdapter(PinchAdapter adapter){
        super.setAdapter(adapter);
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                PinchList.super.onTouchEvent(motionEvent);
                return mScaleDetector.onTouchEvent(motionEvent);
            }
        });
        //Initialize Pinch Parameters
    }
}
