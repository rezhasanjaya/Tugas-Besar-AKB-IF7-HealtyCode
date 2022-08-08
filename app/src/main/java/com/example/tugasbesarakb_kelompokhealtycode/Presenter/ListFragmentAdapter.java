package com.example.tugasbesarakb_kelompokhealtycode.Presenter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;
/**
 4-Agustus-2022
 Nasthasa Wulan Ghani Sopian
 10119276
 IF-7
 */
public class ListFragmentAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> listfrag;
    public ListFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> listfrag) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.listfrag= listfrag;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listfrag.get(position);
    }

    @Override
    public int getCount() {
        return listfrag.size();
    }

}

