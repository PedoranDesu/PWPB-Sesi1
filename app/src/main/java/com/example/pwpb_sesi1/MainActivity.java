package com.example.pwpb_sesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but_lat1;
    Button but_lat2;
    Button but_tulat1;
    Button but_tulat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_lat1 = (Button) findViewById(R.id.btn_lat1);
        but_lat2 = (Button) findViewById(R.id.btn_lat2);
        but_tulat1 = (Button) findViewById(R.id.btn_tulat1);
        but_tulat2 = (Button) findViewById(R.id.btn_tulat2);

        but_lat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,LinearLayout.class);
                startActivity(pindah);
            }
        });

        but_lat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,RelativeLayout.class);
                startActivity(pindah);
            }
        });

        but_tulat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Latihan1.class);
                startActivity(pindah);
            }
        });

        but_tulat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,activity_latihan2.class);
                startActivity(pindah);
            }
        });
    }
}
