package com.example.breakoutdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    //Handler for Waiting
    private Handler LaunchWait = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Stay at LaunchPage for 5 seconds
        LaunchWait.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home_page = new Intent(MainActivity.this, HomePageActivity.class);
                startActivity(home_page);
            }
        }, 3000);
    }
}