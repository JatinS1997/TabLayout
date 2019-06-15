package com.example.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class VPAdapter extends FragmentPagerAdapter {


    public VPAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment1 fragment1 = new Fragment1();
        position += 1;
        Bundle bundle = new Bundle();
        bundle.putString("message","Fragment : "+position);
        fragment1.setArguments(bundle);
        return fragment1;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position+1;
        return "Fragment "+position;
    }
}
