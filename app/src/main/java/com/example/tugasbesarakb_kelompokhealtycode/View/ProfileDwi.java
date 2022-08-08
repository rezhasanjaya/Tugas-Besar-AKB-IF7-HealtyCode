package com.example.tugasbesarakb_kelompokhealtycode.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokhealtycode.R;

/**
 4-Agustus-2022
 Muhamad Marsa Althaf S
 10119277
 IF-7
 */

public class ProfileDwi extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup profile = (ViewGroup) inflater.inflate(R.layout.profile_dwi, container, false);
        return profile;
    }
}
