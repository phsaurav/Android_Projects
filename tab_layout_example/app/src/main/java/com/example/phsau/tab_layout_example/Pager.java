package com.example.phsau.tab_layout_example;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {


    int tabCount;


    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Tab1 tab1 = new Tab1;
                return tab1;
            case 1:
                Tab1 tab2 = new Tab2;
                return tab2;
            case 2:
                Tab1 tab3 = new Tab3;
                return tab3;
                default:
                    return null;



        }

        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
