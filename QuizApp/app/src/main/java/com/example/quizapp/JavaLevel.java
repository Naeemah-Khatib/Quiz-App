package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class JavaLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_javalevel);

        Button btn_javalevel1, btn_javalevel2, btn_javalevel3;
        btn_javalevel1 = findViewById(R.id.btn_javalevel1);
        btn_javalevel2 = findViewById(R.id.btn_javalevel2);
        btn_javalevel3 = findViewById(R.id.btn_javalevel3);

        btn_javalevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaLevel.this, JavaEasy.class);
                startActivity(intent);
            }
        });
        btn_javalevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaLevel.this, JavaMedium.class);
                startActivity(intent);
            }
        });
        btn_javalevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaLevel.this, JavaHard.class);
                startActivity(intent);
            }
        });
    }
}
