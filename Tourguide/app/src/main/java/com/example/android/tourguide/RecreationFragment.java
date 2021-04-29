package com.example.android.tourguide;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RecreationFragment extends Fragment {


    public RecreationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_template, container, false);

        Resources res=getResources();
        final ArrayList<Place> recreation = new ArrayList<>();

        recreation.add(new Place(
                res.getString(R.string.recreation_1_name),
                res.getString(R.string.recreation_1_description),
                R.drawable.recreation1,
                res.getString(R.string.recreation_1_address),
                res.getString(R.string.recreation_1_phone_number),
                res.getString(R.string.recreation_1_website)
        ));
        recreation.add(new Place(
                res.getString(R.string.recreation_2_name),
                res.getString(R.string.recreation_2_description),
                R.drawable.recreation2,
                res.getString(R.string.recreation_2_address),
                res.getString(R.string.recreation_2_phone_number),
                res.getString(R.string.recreation_2_website)
        ));
        recreation.add(new Place(
                res.getString(R.string.recreation_3_name),
                res.getString(R.string.recreation_3_description),
                R.drawable.recreation3,
                res.getString(R.string.recreation_3_address),
                res.getString(R.string.recreation_3_phone_number),
                res.getString(R.string.recreation_3_website)
        ));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), recreation);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
