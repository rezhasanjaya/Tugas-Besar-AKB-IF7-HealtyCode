package com.example.tugasbesarakb_kelompokhealtycode.View;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokhealtycode.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 4-Agustus-2022
 Muhamad Marsa Althaf S
 10119277
 IF-7
 */

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().hide();
        getFragmentPage(new FragmentBase());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                            R.id.dashboard:
                        fragment = new FragmentBase();
                        break;
                    case
                            R.id.wisata:
                        fragment = new ListTempat();
                        break;
                    case
                            R.id.maps:
                        fragment = new MapsFragment();
                        break;
                    case
                            R.id.team:
                        fragment = new ListProfileFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }



    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}