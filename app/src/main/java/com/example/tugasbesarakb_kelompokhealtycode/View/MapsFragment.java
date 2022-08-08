package com.example.tugasbesarakb_kelompokhealtycode.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tugasbesarakb_kelompokhealtycode.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 4-Agustus-2022
 Rezha Satria Sanjaya Putra
 10119281
 IF-7
 */

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng braga = new LatLng(-6.917572677436882, 107.60944482596769);
            googleMap.addMarker(new MarkerOptions().position(braga).title("Jalan Braga Bandung"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(braga));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(braga, 15));

            LatLng KawahPutih = new LatLng(-7.166100823560091, 107.40212892032177);
            googleMap.addMarker(new MarkerOptions().position(KawahPutih).title("Kawah Putih"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(KawahPutih));

            LatLng alunalun = new LatLng(-6.921596154293417, 107.60699263955537);
            googleMap.addMarker(new MarkerOptions().position(alunalun).title("Alun-Alun Kota Bandung"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(alunalun));

            LatLng nimo = new LatLng(-7.220848982363119, 107.57876172371913);
            googleMap.addMarker(new MarkerOptions().position(nimo).title("NIMO Highland"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(nimo));

            LatLng cikole = new LatLng(-6.810328932302288, 107.6428210233656);
            googleMap.addMarker(new MarkerOptions().position(cikole).title("CIKOLE"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(cikole));


        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

}