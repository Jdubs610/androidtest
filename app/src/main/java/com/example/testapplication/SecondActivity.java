package com.example.testapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG, "onCreate(): SecondActivity ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart(): SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG, "onResume(): SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause(): SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop(): SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy(): SecondActivity");
    }
}