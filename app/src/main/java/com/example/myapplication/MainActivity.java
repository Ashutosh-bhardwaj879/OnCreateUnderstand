package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("\nWOW");
        textView.setText("WOW WOW WOW WOW WOW WOW WOW WOW WOW WOW WOW");
        textView.setAllCaps(true);
        textView.setTextSize(56);
        textView.setMaxLines(2);
        //setContentView(R.layout.activity_main);
        setContentView(textView);
    }
}