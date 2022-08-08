package com.example.tugasbesarakb_kelompokhealtycode.Model;

import android.annotation.SuppressLint;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

/**
 4-Agustus-2022
 Rezha Satria Sanjaya
 10119281
 IF-7
 */


@SuppressLint("ParcelCreator")
public class Tempat implements Serializable {
    private String id,
            nama_tempat,
            kategori,
            lokasi,
            longitude,
            latitude,
            key,
            gambar;

    public Tempat() {

    }

    @Exclude
    public String getKey() {
        return key;
    }
    @Exclude
    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getnama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String get_kategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String get_lokasi() {
        return lokasi;
    }

    public void setlokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String get_longitude() {
        return longitude;
    }

    public void setlongitude(String longitude) {
        this.longitude = longitude;
    }

    public String get_latitude() {
        return latitude;
    }

    public void setlatitude(String latitude) {
        this.latitude = latitude;
    }

    public String get_gambar() {
        return gambar;
    }

    public void setgambar(String gambar) {
        this.gambar = gambar;
    }



    public Tempat(String id, String nma, String ktg, String lks, String longi, String lati, String gmbr){
        this.id = id;
        this.nama_tempat = nma;
        this. kategori = ktg;
        this.lokasi = lks;
        this.longitude = longi;
        this.latitude = lati;
        this.gambar = gmbr;
    }
}
