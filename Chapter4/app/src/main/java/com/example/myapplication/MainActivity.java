package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText edit1, edit2;
    private Button addBttn, minusBttn, mulBttn, divMttn;
    private TextView resultText;
    private String num1, num2;
    private Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.google);

        setTitle("계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        addBttn = (Button) findViewById(R.id.BtnAdd);
        minusBttn = (Button) findViewById(R.id.BtnMinus);
        mulBttn = (Button) findViewById(R.id.BtnMultiply);
        divMttn = (Button) findViewById(R.id.Btndivide);
        resultText = (TextView) findViewById(R.id.Result);

        addBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                resultText.setText(String.valueOf(Double.valueOf(num1) + Double.valueOf(num2)));
            }
        });

        minusBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                resultText.setText(String.valueOf(Double.valueOf(num1) - Double.valueOf(num2)));
            }
        });

        mulBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                resultText.setText(String.valueOf(Double.valueOf(num1) * Double.valueOf(num2)));
            }
        });

        divMttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(!num2.equals("0")){
                    resultText.setText(String.valueOf(Double.valueOf(num1) / Double.valueOf(num2)));
                }
                else{
                    resultText.setText("div/0");
                }
            }
        });








    }
}
