package com.example.tugasbesarakb_kelompokhealtycode.View;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasbesarakb_kelompokhealtycode.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 4-Agustus-2022
 Dwi Irfansyah
 10119293
 IF-7
 */

public class AdapterFirebase extends RecyclerView.Adapter<AdapterFirebase.MyViewHolder>{

    Context context;

    ArrayList<DataFirebase> list;
    public ImageView gambar;


    public AdapterFirebase(Context context, ArrayList<DataFirebase> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cardviewnya,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        DataFirebase user = list.get(position);
        holder.namawisata.setText(user.getNamaWisata());
        holder.alamat.setText(user.getAlamat());
        holder.kategori.setText(user.getKategori());
        Picasso.with(context).load(user.getUrlPhoto()).into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView namawisata, kategori, alamat;
        ImageView gambar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            namawisata = itemView.findViewById(R.id.NamaWisata);
            alamat = itemView.findViewById(R.id.NamaJalan);
            gambar = itemView.findViewById(R.id.gambar);
            kategori = itemView.findViewById(R.id.Kategori);

        }
    }
}
