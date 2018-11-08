package com.example.benerin.ui_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button absen ,jadwal,nilai,belajar,berita,informasi, rincianAbsen ,rincianNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        absen = (Button) findViewById(R.id.absen);
        absen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Absen.class);
                startActivity(intent);
            }
        });
        jadwal = (Button) findViewById(R.id.jadwal);
        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jadwal.class);
                startActivity(intent);
            }
        });
        nilai = (Button) findViewById(R.id.nilai);
        nilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Nilai.class);
                startActivity(intent);
            }
        });
        belajar = (Button) findViewById(R.id.belajar);
        belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Belajar.class);
                startActivity(intent);
            }
        });
        berita = (Button) findViewById(R.id.berita);
        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Berita.class);
                startActivity(intent);
            }
        });
        informasi = (Button) findViewById(R.id.informasi);
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Informasi.class);
                startActivity(intent);
            }
        });
        rincianAbsen = (Button) findViewById(R.id.rincianAbsen);
        rincianAbsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RincianAbsen.class);
                startActivity(intent);
            }
        });
        rincianNilai = (Button) findViewById(R.id.rincianNilai);
        rincianNilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RincianNilai.class);
                startActivity(intent);
            }
        });

    }
}
