package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.RecyclerView.OnItemClickListener;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerTouchListener implements RecyclerView.OnItemTouchListener{

    private RecyclerViewClickListener mRecyclerViewClickListener;
    private GestureDetector mGestureDetector;
    private RecyclerView mRecyclerView;

    public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final RecyclerViewClickListener recyclerViewClickListener){
        this.mRecyclerView = recyclerView;
        this.mRecyclerViewClickListener = recyclerViewClickListener;

        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                View child = mRecyclerView.findChildViewUnder(e.getX(), e.getY());
                if (child != null && mRecyclerViewClickListener != null){
                    mRecyclerViewClickListener.onLongClick(child, mRecyclerView.getChildAdapterPosition(child));
                }
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        if (child != null && mRecyclerViewClickListener != null && mGestureDetector.onTouchEvent(e)){
            mRecyclerViewClickListener.onClick(child, rv.getChildAdapterPosition(child));
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
