package com.sample.app.architecture.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sample.app.architecture.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}