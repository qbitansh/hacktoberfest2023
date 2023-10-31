package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNum,secondNum;
    TextView ans;
    Button add,sub,multiply,divide,clc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum=findViewById(R.id.firstNum);
        secondNum=findViewById(R.id.secondNum);
        ans=findViewById(R.id.ans);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        clc=findViewById(R.id.clc);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double answer=0;
                double a=Double.parseDouble(firstNum.getText().toString());
                double b=Double.parseDouble(secondNum.getText().toString());
                answer=a+b;
                ans.setText("="+answer);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double answer=0;
                double a=Double.parseDouble(firstNum.getText().toString());
                double b=Double.parseDouble(secondNum.getText().toString());
                answer=a-b;
                ans.setText("="+answer);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double answer=0;
                double a=Double.parseDouble(firstNum.getText().toString());
                double b=Double.parseDouble(secondNum.getText().toString());
                answer=a*b;
                ans.setText("="+answer);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double answer=0;
                double a=Double.parseDouble(firstNum.getText().toString());
                double b=Double.parseDouble(secondNum.getText().toString());
                answer=a/b;
                ans.setText("="+answer);
            }
        });
        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                firstNum.setText("");
                secondNum.setText("");
            }
        });
    }
}
