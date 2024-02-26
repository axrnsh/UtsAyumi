package com.example.utsayumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout sepLayout;
    LinearLayout profilEditLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sepLayout = findViewById(R.id.sep);
        profilEditLayout = findViewById(R.id.profilEdit);

        sepLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SEPPoin.class);
                startActivity(intent);
            }
        });

        profilEditLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilMahasiswa.class);
                startActivity(intent);
            }
        });

    }

}