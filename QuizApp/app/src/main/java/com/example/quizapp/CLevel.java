package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_clevel);

        Button btn_clevel1, btn_clevel2, btn_clevel3;
        btn_clevel1 = findViewById(R.id.btn_clevel1);
        btn_clevel2 = findViewById(R.id.btn_clevel2);
        btn_clevel3 = findViewById(R.id.btn_clevel3);

        btn_clevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLevel.this, CEasy.class);
                startActivity(intent);
            }
        });
        btn_clevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLevel.this, CMedium.class);
                startActivity(intent);
            }
        });
        btn_clevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLevel.this, CHard.class);
                startActivity(intent);
            }
        });
    }
}
