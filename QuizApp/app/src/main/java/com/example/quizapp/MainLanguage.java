package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_language);

        Button btn_c, btn_java, btn_python;
        btn_c = findViewById(R.id.btn_c);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLanguage.this, CLevel.class);
                startActivity(intent);
            }
        });

        btn_java = findViewById(R.id.btn_java);

        btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLanguage.this, JavaLevel.class);
                startActivity(intent);
            }
        });

        btn_python = findViewById(R.id.btn_python);

        btn_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLanguage.this, PythonLevel.class);
                startActivity(intent);
            }
        });

    }
}
