package com.epicodus.myrestaurants.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.epicodus.myrestaurants.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by spuek on 10/17/17.
 */

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {

    private ArrayList<Restaurant> mRestaurants = new ArrayList<>();

    private Context mContext;

    public RestaurantListAdapter(Context context, ArrayList<Restaurant> restaurants){
        mContext = context;
        mRestaurants = restaurants;
    }

}
