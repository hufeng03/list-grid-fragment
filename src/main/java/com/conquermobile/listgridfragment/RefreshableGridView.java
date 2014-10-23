package com.conquermobile.listgridfragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.android.photos.views.HeaderGridView;

/**
 * Created by feng on 2014-04-11.
 */
public class RefreshableGridView extends HeaderGridView {
    public RefreshableGridView(Context context) {
        super(context);
    }

    public RefreshableGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RefreshableGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setVisibility(int visibility) {
        if (visibility == View.GONE && getCount() == 0) {
            return;
        }
        super.setVisibility(visibility);
    }
}
