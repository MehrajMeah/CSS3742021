package com.example.eurostodollars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int euros = 0;
    private double dollars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollars = (TextView) findViewById(R.id.dollarText);
    }

    private void convert (View view) {
        dollars = euros * 1.13;
    }
}