package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "The Application is onCreate state");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "The Application is onStart state");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "The Application is onResume state");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "The Application is onPause state");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "The Application is onStop state");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "The Application onDestroy state ");
    }
}