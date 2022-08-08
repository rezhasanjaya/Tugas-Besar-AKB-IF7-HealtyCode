package com.example.tugasbesarakb_kelompokhealtycode.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokhealtycode.R;

/**
 4-Agustus-2022
 Muhamad Marsa Altaf S
 10119277
 IF-7
 */

public class ProfileMarsa extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup profile = (ViewGroup) inflater.inflate(R.layout.profile_marsa, container, false);
        return profile;
    }
}
