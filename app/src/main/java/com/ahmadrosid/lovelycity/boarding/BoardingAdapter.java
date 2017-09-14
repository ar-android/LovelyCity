package com.ahmadrosid.lovelycity.boarding;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ocittwo on 9/14/17.
 */

public class BoardingAdapter extends FragmentPagerAdapter{

    public BoardingAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragmentBandung.newInstance();
            case 1:
                return FragmentYogyakarta.newInstance();
            case 2:
                return FragmentBali.newInstance();
            default:
                return FragmentBandung.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
