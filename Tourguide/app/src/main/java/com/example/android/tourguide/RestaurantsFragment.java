package com.example.android.tourguide;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_template, container, false);

        Resources res=getResources();
        final ArrayList<Place> restaurants = new ArrayList<>();

        restaurants.add(new Place(
                res.getString(R.string.restaurant_1_name),
                res.getString(R.string.restaurant_1_description),
                R.drawable.restaurant1,
                res.getString(R.string.restaurant_1_address),
                res.getString(R.string.restaurant_1_phone_number),
                res.getString(R.string.restaurant_1_website)
        ));
        restaurants.add(new Place(
                res.getString(R.string.restaurant_2_name),
                res.getString(R.string.restaurant_2_description),
                R.drawable.restaurant2,
                res.getString(R.string.restaurant_2_address),
                res.getString(R.string.restaurant_2_phone_number),
                res.getString(R.string.restaurant_2_website)
        ));
        restaurants.add(new Place(
                res.getString(R.string.restaurant_3_name),
                res.getString(R.string.restaurant_3_description),
                R.drawable.restaurant3,
                res.getString(R.string.restaurant_3_address),
                res.getString(R.string.restaurant_3_phone_number),
                res.getString(R.string.restaurant_3_website)
        ));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
