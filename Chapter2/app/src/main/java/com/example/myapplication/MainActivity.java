package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button callBttn;
    private Button galleryBttn;
    private Button exitBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.google);

        button = (Button) findViewById(R.id.button1);
        button.setBackgroundColor(Color.GRAY);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });

        callBttn = (Button) findViewById(R.id.button2);
        callBttn.setBackgroundColor(Color.GREEN);
        callBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010"));
                startActivity(mIntent);
            }
        });

        galleryBttn = (Button) findViewById(R.id.button3);
        galleryBttn.setBackgroundColor(Color.RED);
        galleryBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        exitBttn = (Button) findViewById(R.id.button4);
        exitBttn.setBackgroundColor(Color.YELLOW);
        exitBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
