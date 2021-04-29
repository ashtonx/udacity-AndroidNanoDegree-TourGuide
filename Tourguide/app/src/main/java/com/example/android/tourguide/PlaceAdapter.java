package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity context, ArrayList<Place> place) {
        super(context, 0, place);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //check if reused
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Place currentPlace = getItem(position);
        final String NULLSTRING = getContext().getString(R.string.null_string);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        if (currentPlace.getDescription().equals(NULLSTRING))
            descriptionTextView.setVisibility(View.GONE);
        else
            descriptionTextView.setText(currentPlace.getDescription());
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        if (currentPlace.getAddress().equals(NULLSTRING))
            addressTextView.setVisibility(View.GONE);
        else {
            addressTextView.setText(currentPlace.getAddress());
            addressTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                            "geo:0,0?q=" + Uri.encode(currentPlace.getAddress())));
                    if (geoIntent.resolveActivity(v.getContext().getPackageManager()) != null)
                        v.getContext().startActivity(geoIntent);
                }
            });
        }
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        if (currentPlace.getPhoneNumber().equals(NULLSTRING))
            phoneTextView.setVisibility(View.GONE);
        else {
            phoneTextView.setText(currentPlace.getPhoneNumber());
            phoneTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(
                            "tel:" + currentPlace.getPhoneNumber()));
                    if (phoneIntent.resolveActivity(v.getContext().getPackageManager()) != null)
                        v.getContext().startActivity(phoneIntent);
                }
            });
        }
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        if (currentPlace.getWebsite().equals("http://" + NULLSTRING))
            websiteTextView.setVisibility(View.GONE);
        else {
            websiteTextView.setText(currentPlace.getWebsite());
            websiteTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                            currentPlace.getWebsite()));
                    if (browserIntent.resolveActivity(v.getContext().getPackageManager()) != null)
                        v.getContext().startActivity(browserIntent);
                }
            });
        }
        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture);
        if (currentPlace.hasImage())
            pictureImageView.setImageResource(currentPlace.getImageResourceId());
        else
            pictureImageView.setVisibility(View.INVISIBLE);
        return listItemView;
    }
}
