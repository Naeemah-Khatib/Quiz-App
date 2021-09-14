package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PythonHard extends AppCompatActivity {

    int k = -1, count=0, j=-1, i=0;

    Button op1, op2, op3, op4;
    TextView ceq;


    String questions[] = {
            "print('It's ok, don't worry')  What will be the output of this program?",
            "Which of the following keywords is not reversed keyword in python?",
            "print(max('zoo 145 com'))  What will be the output of this program?",
            "a = '123789'  while x in a:  print(x, end=' ') What will be the output of this program?",
            "Which of the following objects are present in the function header in python?",
            "Which one of the following is the right way to call a function?",
            "Suppose a user wants to print the second value of an array, which has 5 elements. What will be the syntax of the second value of the array?",
            "str = [(1, 1), (2, 2), (3, 3)]  What type of data is in this expression?",
            "Which of the following statements is not valid regarding the variable in python?",
            "Which of the following statements is valid for 'if statement'?"
            };

    String options[] = {
            "It's ok, don't worry","It's ok, don't worry","SyntaxError: EOL while scanning string literal","SyntaxError: invalid syntax",
            "None","class","goto","and",
            "145","122","a","z",
            "i i i i i i …","123789","SyntaxError","NameError",
            "Function name and Parameters","Only function name","Only parameters","None of the these",
            "call function_name()","function function_name()","function_name()","None of the these",
            "array[2]","array[1]","array[-1]","array[-2]",
            "String type","Array lists","List of tuples","str lists",
            "The variable_name can begin with alphabets","The variable_name can begin with an underscore","The variable_name can begin with a number","None of the these",
            "if f >= 12:","if (f >= 122)","if (f => 1222)","if f >= 12222"
    };

    String answers[] = {
            "It's ok, don't worry","goto","z","NameError","Function name and Parameters","function_name()","array[1]","List of tuples","The variable_name can begin with a number",
            "if f >= 12:"
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
                                Intent intent = new Intent(PythonHard.this, PythonLevel.class);
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
                            Intent intent = new Intent(PythonHard.this, MainLanguage.class);
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

