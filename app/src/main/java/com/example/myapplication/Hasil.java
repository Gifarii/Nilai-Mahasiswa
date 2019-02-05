package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView tvHasilku;
    String nama, npm, kelas, suts, suas, hasil;
    int uts, uas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama = getIntent().getStringExtra("putNama");
        npm = getIntent().getStringExtra("putNPM");
        kelas = getIntent().getStringExtra("putKelas");
        suts = getIntent().getStringExtra("putUTS");
        suas = getIntent().getStringExtra("putUAS");

        hasil = String.valueOf((Integer.valueOf(suts)*0.7)+(Integer.parseInt(suas)*0.3));

        tvHasilku = (TextView)findViewById(R.id.tv_Hasilku);
        tvHasilku.setText("nama : "+nama+"\nnpm : "+npm+"\nkelas : "+kelas+"\nnilai : "+hasil);

    }
}
