package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.PageAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.Tabs.TabAllSongsList;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.Tabs.TabVoteList;

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int mNumberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.mNumberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TabVoteList tabVoteList = new TabVoteList();
                return tabVoteList;

            case 1:
                TabAllSongsList tabAllSongsList = new TabAllSongsList();
                return tabAllSongsList;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
