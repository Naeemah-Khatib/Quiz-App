package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CMedium extends AppCompatActivity {

    int k = -1, count=0, j=-1, i=0;

    Button op1, op2, op3, op4;
    TextView ceq;


    String questions[] = {
            "main()  {printf('javatpoint');  main();} What will be the output of this program?",
            "What is required in each C program?",
            "What is the output of this statement 'printf('%d', (a++))'?",
            "In the C language, the constant is defined _______.",
            "What will the result of num variable after execution of the following statements? int num = 58;  \n" +
                    "num % = 11;  ",
            "Which of the following statement is not true?",
            "What is the precedence of arithmetic operators (from highest to lowest)?",
            "Which among the following is Copying function?",
            "Which of the following is the variable type defined in header string.h?",
            "Guess the output:: int main() { int a = 5; int b = 10; { int a = 2; a++; b++; } printf('%d %d', a, b); return 0; }"};

    String options[] = {
            "Wrong statement","It will keep on printing javatpoint","It will Print javatpoint once","None of the these",
            "The program must have at least one function.","The program does not require any function.","Input data","Output data",
            "The value of (a + 1)","The current value of a","Error message","Garbage",
            "Before main","After main","Anywhere, but starting on a new line","None of the these",
            "3","5","8","11",
            "A pointer to an int and a pointer to a double are of the same size.","A pointer must point to a data item on the heap (free store).",
            "A pointer can be reassigned to point to another data item.","A pointer can point to an array.",
            "%, *, /, +, –","%, +, /, *, –","+, -, %, *, /","%, +, -, *, /",
            "memcpy()","strcopy()","memcopy()","strxcpy()",
            "sizet","size","size_t","size-t",
            "6,11","11 6","6 10","5 11"
    };

    String answers[] = {
            "It will keep on printing javatpoint","The program must have at least one function.",
            "The current value of a","Anywhere, but starting on a new line",
            "3","A pointer must point to a data item on the heap (free store).",
            "%, *, /, +, –","memcpy()","size_t","5 11"
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
                                Intent intent = new Intent(CMedium.this, CLevel.class);
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
                            Intent intent = new Intent(CMedium.this, MainLanguage.class);
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

