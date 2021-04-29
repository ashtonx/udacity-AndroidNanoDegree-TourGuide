package com.example.android.tourguide;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_template, container, false);

        Resources res=getResources();
        final ArrayList<Place> hotels = new ArrayList<>();
        hotels.add(new Place(
                res.getString(R.string.hotel_1_name),
                res.getString(R.string.hotel_1_description),
                R.drawable.hotel1,
                res.getString(R.string.hotel_1_address),
                res.getString(R.string.hotel_1_phone_number),
                res.getString(R.string.hotel_1_website)
        ));
        hotels.add(new Place(
                res.getString(R.string.hotel_2_name),
                res.getString(R.string.hotel_2_description),
                R.drawable.hotel2,
                res.getString(R.string.hotel_2_address),
                res.getString(R.string.hotel_2_phone_number),
                res.getString(R.string.hotel_2_website)
        ));
        hotels.add(new Place(
                res.getString(R.string.hotel_3_name),
                res.getString(R.string.hotel_3_description),
                R.drawable.hotel3,
                res.getString(R.string.hotel_3_address),
                res.getString(R.string.hotel_3_phone_number),
                res.getString(R.string.hotel_3_website)
        ));
        hotels.add(new Place(
                res.getString(R.string.hotel_4_name),
                res.getString(R.string.hotel_4_description),
                R.drawable.hotel4,
                res.getString(R.string.hotel_4_address),
                res.getString(R.string.hotel_4_phone_number),
                res.getString(R.string.hotel_4_website)
        ));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
