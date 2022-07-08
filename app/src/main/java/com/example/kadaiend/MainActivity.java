package com.example.kadaiend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void beginner(View view){
        Intent intent=new Intent(this, brickBreakerActivity.class);
        intent.putExtra("difficulty", "beginner");
        startActivity(intent);
    }

    public void normal(View view){
        Intent intent=new Intent(this, brickBreakerActivity.class);
        intent.putExtra("difficulty", "normal");
        startActivity(intent);
    }

    public void advanced(View view){
        Intent intent=new Intent(this, brickBreakerActivity.class);
        intent.putExtra("difficulty", "advanced");
        startActivity(intent);
    }
}