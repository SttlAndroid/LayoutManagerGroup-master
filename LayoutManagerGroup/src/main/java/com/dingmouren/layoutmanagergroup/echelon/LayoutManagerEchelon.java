package com.dingmouren.layoutmanagergroup.echelon;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Smit Shah on Mar 01 2019, 11:23 AM
 */
public class LayoutManagerEchelon extends RecyclerView.LayoutManager {

    private int mItemViewHeight, mItemViewWidth, mItemCount, mScrollOffset = Integer.MAX_VALUE;
    private float mScale = 0.9f;
    private Context mContext;


    public LayoutManagerEchelon(Context context) {
        this.mContext = context;
        mItemViewWidth = (int) (getHorizontalSpace() * 0.87f);
        mItemViewHeight = (int) (mItemViewWidth * 1.46f);
    }

    @Override public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT,
                RecyclerView.LayoutParams.WRAP_CONTENT);
    }

    private int getHorizontalSpace() {
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }
}
