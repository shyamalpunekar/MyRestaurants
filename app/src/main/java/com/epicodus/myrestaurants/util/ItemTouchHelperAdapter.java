package com.epicodus.myrestaurants.util;

/**
 * Created by spunek on 10/30/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
