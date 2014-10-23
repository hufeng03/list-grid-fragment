package com.conquermobile.listgridfragment;

import android.widget.ListAdapter;

/**
 * Created by feng on 13-9-10.
 */
public interface ListGridAdapter extends ListAdapter {
    abstract void changeDisplayMode(ListGridFragment.DISPLAY_MODE mode);
    abstract ListGridFragment.DISPLAY_MODE getDisplayMode();
}
