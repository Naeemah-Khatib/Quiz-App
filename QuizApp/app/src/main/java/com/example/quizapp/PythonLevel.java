package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PythonLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_pythonlevel);

        Button btn_pylevel1, btn_pylevel2, btn_pylevel3;
        btn_pylevel1 = findViewById(R.id.btn_pylevel1);
        btn_pylevel2 = findViewById(R.id.btn_pylevel2);
        btn_pylevel3 = findViewById(R.id.btn_pylevel3);

        btn_pylevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonLevel.this, PythonEasy.class);
                startActivity(intent);
            }
        });
        btn_pylevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonLevel.this, PythonMedium.class);
                startActivity(intent);
            }
        });
        btn_pylevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonLevel.this, PythonHard.class);
                startActivity(intent);
            }
        });
    }
}
