package com.example.notebook;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.viewsystem.motion.scroller.ScrollerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollerView scrollerView = findViewById(R.id.scroller_view);
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollerView.smoothScrollTo(-300, -500);
            }
        }, 3000);
    }
}