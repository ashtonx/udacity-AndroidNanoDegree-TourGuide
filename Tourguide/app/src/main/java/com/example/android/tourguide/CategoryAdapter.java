package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public CategoryAdapter (Context context, FragmentManager fm){
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new SightsFragment();
            case 1: return new RecreationFragment();
            case 2: return new RestaurantsFragment();
            case 3: return new HotelsFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return mContext.getString(R.string.category_sights_name);
            case 1: return mContext.getString(R.string.category_recreation_name);
            case 2: return mContext.getString(R.string.category_restaurants_name);
            case 3: return mContext.getString(R.string.category_hotels_name);
            default: return null;
        }
    }
}
