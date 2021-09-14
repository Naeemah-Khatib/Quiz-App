package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class JavaHard extends AppCompatActivity {

    int k = -1, count=0, j=-1, i=0;

    Button op1, op2, op3, op4;
    TextView ceq;


    String questions[] = {
            "What are the features reused using Inheritance in Java?",
            "To successfully overload a method in Java, the method names must be ___.",
            "___ is the superclass to all Java classes either user-defined or built-in.",
            "Choose the correct identifier for a method name in Java.",
            "In Java, local variables are stored in __ memory and instance variables are stored in ___ memory.",
            " Given a class named student, which of the following is a valid constructor declaration for the class?",
            "What is the error in the following class definitions? Abstract class xy { abstract sum (int x, int y) { } }",
            "Which of these field declarations are legal within the body of an interface?",
            "Basic Java language functions are stored in which of the following java package?",
            "Which of the following has a method names flush( )?"
            };

    String options[] = {
            "Methods","Variables","Constants","All the above",
            "Same","Different","Same or different","None",
            "Class","Object","Superclass","Null",
            "1show","$hide","*show$","3_click",
            "Stack, Stack","Heap, Heap","Stack, Heap","Heap, Stack",
            "Student (student s) { }","Student student ( ) { }","Private final student ( ) { }","Void student ( ) { }",
            "Class header is not defined properly.","Constructor is not defined.","Method is not defined properly","Method is defined properly",
            "Private final static int answer = 42","public static int answer=42","final static answer =42","int answer",
            "java.lang","java.io","java.net","java.util",
            " Input stream","Output Stream","Reader stream","Input reader stream"
    };

    String answers[] = {
            "All the above","Same","Object","$hide","Stack, Heap","Student (student s) { } ","Method is not defined properly",
            "public static int answer=42","java.lang","Output Stream"
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_easy);
        ceq = findViewById(R.id.ceq);
        Button next = findViewById(R.id.next);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);


        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i==questions.length){
                    ceq.setText("Score Board");
                    op1.setText("Total: 10");
                    op2.setText("Correct: "+count);
                    op3.setText("Incorrect: "+(10-count));
                    if(count>=9)  op4.setText("Excellent!!");
                    else if(count>=5) op4.setText("Good!!");
                    else{
                        op4.setText("Try Again");
                        op4.setOnClickListener(new OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(JavaHard.this, JavaLevel.class);
                                startActivity(intent);
                            }
                        });
                    }
                    i++;
                    next.setText("Done");
                }
                else if(i==questions.length+1){
                    next.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(JavaHard.this, MainLanguage.class);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    ceq.setText(questions[i++]);
                    op1.setText(options[++j]);
                    op2.setText(options[++j]);
                    op3.setText(options[++j]);
                    op4.setText(options[++j]);

                    op1.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (op1.getText().toString().equals(answers[++k])) {
                                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                count++;

                            } else {
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    op2.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (op2.getText().toString().equals(answers[++k])) {
                                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                count++;

                            } else {
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    op3.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (op3.getText().toString().equals(answers[++k])) {
                                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                count++;

                            } else {
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    op4.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (op4.getText().toString().equals(answers[++k])) {
                                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                                count++;

                            } else {
                                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

}

