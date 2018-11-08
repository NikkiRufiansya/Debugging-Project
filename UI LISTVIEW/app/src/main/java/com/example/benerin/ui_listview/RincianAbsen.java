package com.example.benerin.ui_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RincianAbsen extends AppCompatActivity {
Button kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_absen);

        kembali = (Button) findViewById(R.id.kembaliAbsen);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RincianAbsen.this ,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
