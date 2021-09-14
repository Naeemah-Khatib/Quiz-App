package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PythonEasy extends AppCompatActivity {

    int k = -1, count=0, j=-1, i=0;

    Button op1, op2, op3, op4;
    TextView ceq;


    String questions[] = {
            "Who developed the Python language?",
            "In which language is Python written?",
            "Which one of the following is the correct extension of the Python file?",
            "What do we use to define a block of code in Python language?",
            "Which character is used in Python to make a single line comment?",
            "What is the method inside the class in python language?",
            "Which of the following declarations is incorrect?",
            "Which of the following is not a keyword in Python language?",
            "Which of the following declarations is incorrect in python language?",
            "Which of the following operators is the correct option for power(ab)?"
            };

    String options[] = {
            "Zim Den","Guido van Rossum","Niene Stom","Wick van Rossum",
            "English","PHP","C","All of the above",
            ".py",".python",".p","None of these",
            "Key","Brackets","Indentation","None of these",
            "/","//","#","!",
            "Object","Function","Attribute","Argument",
            "_x = 2","__x = 3","__xyz__ = 5","None of these",
            "val","raise","try","with",
            "xyzp = 5,000,000","x y z p = 5000 6000 7000 8000","x,y,z,p = 5000, 6000, 7000, 8000","x_y_z_p = 5,000,000",
            "a ^ b","a**b","a ^ ^ b","a ^ * b"
    };

    String answers[] = {
            "Guido van Rossum","C",".py","Indentation","#","Function","None of these","val","x y z p = 5000 6000 7000 8000","a**b"
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
                                Intent intent = new Intent(PythonEasy.this, PythonLevel.class);
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
                            Intent intent = new Intent(PythonEasy.this, MainLanguage.class);
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

