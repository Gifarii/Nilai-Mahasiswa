package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtKelas, edtNPM, edtUTS, edtUAS;
    String nama, npm, kelas,uts,uas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText)findViewById(R.id.edt_Nama);
        edtNPM = (EditText)findViewById(R.id.edt_NPM);
        edtKelas = (EditText)findViewById(R.id.edt_Kelas);
        edtUTS = (EditText)findViewById(R.id.edt_UTS);
        edtUAS = (EditText)findViewById(R.id.edt_UAS);

    }

    public void Proceed(View view) {


        if(TextUtils.isEmpty(edtNama.getText().toString())){
            edtNama.setError("ISI NAMA !");
        } else if(TextUtils.isEmpty(edtNPM.getText().toString())){
            edtNPM.setError("ISI NPM !");
        } else if(TextUtils.isEmpty(edtKelas.getText().toString())){
            edtKelas.setError("ISI KELAS!");
        } else if(TextUtils.isEmpty(edtUTS.getText().toString())){
            edtUTS.setError("ISI UTS !");
        } else if(TextUtils.isEmpty(edtUAS.getText().toString())){
            edtUAS.setError("ISI UAS !");
        } else {
            Intent intent = new Intent(this, Hasil.class);
            nama = edtNama.getText().toString();
            npm = edtNPM.getText().toString();
            kelas = edtKelas.getText().toString();
            uts = edtUTS.getText().toString();
            uas = edtUAS.getText().toString();

            intent.putExtra("putNama", nama);
            intent.putExtra("putNPM", npm);
            intent.putExtra("putKelas", kelas);
            intent.putExtra("putUTS", uts);
            intent.putExtra("putUAS", uas);

            startActivity(intent);
        }

    }
}
