package com.example.tugasbesarakb_kelompokhealtycode.Presenter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasbesarakb_kelompokhealtycode.Model.Tempat;
import com.example.tugasbesarakb_kelompokhealtycode.R;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 4-Agustus-2022
 Rezha Satria Sanjaya
 10119281
 IF-7
 */
public class InputActivity extends AppCompatActivity {

    private Tempat tempat;

    private EditText editid, editTempat, editCategory, editLocation, editLongitude, editLatitude ;
    private TextView titleAdd, selectimage;

    private Button btn_submit;
    private ImageButton button;
    private ImageView click;

    private DatabaseReference database;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        getSupportActionBar().hide();

        //Tittle
        titleAdd = findViewById(R.id.addMyNotes);
        //Edit Field
        editid = findViewById(R.id.id);
        editTempat = findViewById(R.id.input_tempat);
        editLatitude = findViewById(R.id.latitude);
        editLongitude = findViewById(R.id.longitude);
        editCategory = findViewById(R.id.input_kategori);
        editLocation = findViewById(R.id.input_lokasi);
        selectimage = findViewById(R.id.gambar);
        //button
        btn_submit = (Button) findViewById(R.id.btn_sumbit);
        button = findViewById(R.id.kembali);
        //Image
        click = findViewById(R.id.click);
        selectimage = findViewById(R.id.selectimage);
        //DB
        tempat = new Tempat();
        database = FirebaseDatabase.getInstance().getReference();
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmpty(editid.getText().toString()) && !isEmpty(editTempat.getText().toString()) && !isEmpty(editCategory.getText().toString()) && !isEmpty(editLocation.getText().toString()) && !isEmpty(editLongitude.getText().toString()) && !isEmpty(editLatitude.getText().toString()) && !isEmpty(selectimage.getText().toString()))
                    submitTempat(new Tempat(editid.getText().toString(), editTempat.getText().toString(), editCategory.getText().toString(), editLocation.getText().toString(), editLongitude.getText().toString(), editLatitude.getText().toString(), selectimage.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.btn_sumbit), "Data tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        editid.getWindowToken(), 0);
            }
        });
    }

    private boolean isEmpty(String id) {
        // Cek apakah ada fields yang kosong, sebelum disubmit
        return TextUtils.isEmpty(id);
    }

    private void updateTempat(Tempat tempat) {
        // kodingan untuk next tutorial ya :p
    }

    private void submitTempat(Tempat tempat) {
        /**
         * Ini adalah kode yang digunakan untuk mengirimkan data ke Firebase Realtime Database
         * dan juga kita set onSuccessListener yang berisi kode yang akan dijalankan
         * ketika data berhasil ditambahkan
         */
        database.child("tempat").push().setValue(tempat).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                editid.setText("");
                editTempat.setText("");
                editCategory.setText("");
                editLocation.setText("");
                editLongitude.setText("");
                editLatitude.setText("");
                Snackbar.make(findViewById(R.id.btn_sumbit), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, InputActivity.class);
    }
//    private void save()
//    {
//        String id = editid.getText().toString().trim();
//        String nama_tempat = editTempat.getText().toString().trim();
//        String kategori = editCategory.getText().toString().trim();
//        String lokasi = editLocation.getText().toString().trim();
//        String longitude = editLongitude.getText().toString().trim();
//        String latitude = editLatitude.getText().toString().trim();
//        //String gambar = selectimage.getText().toString().trim();
//
//        boolean isEmptyFields;
//        isEmptyFields = false;
//
//        if (TextUtils.isEmpty(id)) {
//            isEmptyFields = true;
//            editid.setError("Field Id tidak boleh kosong");
//        }
//
//        if (TextUtils.isEmpty(nama_tempat)) {
//            isEmptyFields = true;
//            editTempat.setError("Field ini tidak boleh kosong");
//        }
//
//        if (TextUtils.isEmpty(kategori)) {
//            isEmptyFields = true;
//            editCategory.setError("Field ini tidak boleh kosong");
//        }
//
//        if (TextUtils.isEmpty(lokasi)) {
//            isEmptyFields = true;
//            editLocation.setError("Field ini tidak boleh kosong");
//        }
//
//        if (TextUtils.isEmpty(longitude)) {
//            isEmptyFields = true;
//            editLongitude.setError("Field ini tidak boleh kosong");
//        }
//
//        if (TextUtils.isEmpty(latitude)) {
//            isEmptyFields = true;
//            editLatitude.setError("Field ini tidak boleh kosong");
//        }
//
//
//        if (! isEmptyFields) {
//
//            Toast.makeText(InputActivity.this, "Data Berhasil Ditambah", Toast.LENGTH_SHORT).show();
//            DatabaseReference dbTempat = mDatabase.child("tempat");
//
//            id = dbTempat.push().getKey();
//            tempat.setId(id);
//            tempat.setNama_tempat(nama_tempat);
//            tempat.setKategori(kategori);
//            tempat.setlokasi(lokasi);
//            tempat.setlongitude(longitude);
//            tempat.setlatitude(latitude);
//            //tempat.setgambar(gambar);
//
//            //insert data
//            dbTempat.child(id).setValue(tempat);
//            finish();
//
//        }
//    }
}