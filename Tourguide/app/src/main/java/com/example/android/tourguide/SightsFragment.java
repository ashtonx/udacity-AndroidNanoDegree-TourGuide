package com.example.android.tourguide;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_template, container, false);

        Resources res=getResources();
        final ArrayList<Place> sights = new ArrayList<>();

        sights.add(new Place(
                res.getString(R.string.sights_1_name),
                res.getString(R.string.sights_1_description),
                R.drawable.sights1,
                res.getString(R.string.sights_1_address),
                res.getString(R.string.sights_1_phone_number),
                res.getString(R.string.sights_1_website)
        ));
        sights.add(new Place(
                res.getString(R.string.sights_2_name),
                res.getString(R.string.sights_2_description),
                R.drawable.sights2,
                res.getString(R.string.sights_2_address),
                res.getString(R.string.sights_2_phone_number),
                res.getString(R.string.sights_2_website)
        ));

        sights.add(new Place(
                res.getString(R.string.sights_3_name),
                res.getString(R.string.sights_3_description),
                R.drawable.sights3,
                res.getString(R.string.sights_3_address),
                res.getString(R.string.sights_3_phone_number),
                res.getString(R.string.sights_3_website)
        ));

        sights.add(new Place(
                res.getString(R.string.sights_4_name),
                res.getString(R.string.sights_4_description),
                R.drawable.sights4,
                res.getString(R.string.sights_4_address),
                res.getString(R.string.sights_4_phone_number),
                res.getString(R.string.sights_4_website)
        ));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
