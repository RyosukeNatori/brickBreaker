package com.example.kadaiend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class brickBreakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brick_breaker);

        Intent intent=getIntent();
        String difficulty=intent.getStringExtra("difficulty");
        TextView textView=(TextView) findViewById(R.id.textview);
        textView.setText(difficulty);
    }
}