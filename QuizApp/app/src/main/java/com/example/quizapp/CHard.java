package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CHard extends AppCompatActivity {

    int k = -1, count=0, j=-1, i=0;

    Button op1, op2, op3, op4;
    TextView ceq;


    String questions[] = {
            "How many times will the following loop execute? for(j = 1; j <= 10; j = j-1)  ",
            "What will the result of len variable after execution of the following statements? int len; char str1[] = {'39 march road'}; len = strlen(str1); ",
            "Given the following statement, what will be displayed on the screen? int * aPtr; *aPtr = 100; cout << *aPtr + 2;",
            "When double is converted to float, the value is?",
            "The associativity of ! operator is",
            "An expression contains relational, assign. ment and arithmetic operators. If Parenthesis are not present, the order will be",
            "A Link is",
            "What is the size of a C structure.?",
            "Processor Directive in C language starts with.?",
            "What is the need for a File when you can store anything in memory.?"
    };

    String options[] = {
            "Forever","Never","0","1",
            "11","12","13","14",
            "100","102","104","108",
            "Truncated","Rounded","Depends on the compiler","Depends on the standard",
            "(a)Right to Left","(b)Left to Right","(a) for Arithmetic and (b) for Relational","(a) for Relational and (b) for Arithmetic",
            "Assignment, arithmetic, relational","Relational, arithmetic, assignment","Assignment, relational, arithmetic","Arithmetic,relational, assignment",
            "a compiler","an active debugger","a C interpreter","an analyzing tool in C",
            "C structure is always 128 bytes.","Size of C structure is the total bytes of all elements of structure.","Size of C structure is the size of largest element.","None of the above",
            "$ symbol (DOLLAR)","@ symbol (At The Rate)","& symbol (Ampersand)","# symbol (HASH)",
            "Memory (RAM) is limited in any computer.","A file is stored on Hard Disk which can store Gigabytes of data.",
            "File stored on Hard Disk is safe even if PC is switched off. But Memory or RAM contents are cleared when PC is off.","All the above"
    };

    String answers[] = {
           "Forever","13","102","Depends on the compiler","(a)Right to Left",
            "Arithmetic,relational, assignment","an analyzing tool in C",
            "Size of C structure is the total bytes of all elements of structure.",
            "# symbol (HASH)","All the above"
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
                                Intent intent = new Intent(CHard.this, CLevel.class);
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
                            Intent intent = new Intent(CHard.this, MainLanguage.class);
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

