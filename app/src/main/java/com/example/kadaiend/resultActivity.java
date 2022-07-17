package com.example.kadaiend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textView=findViewById(R.id.textview);
        Intent intent=getIntent();
        String result=intent.getStringExtra("result");
        int intResult=Integer.parseInt(result);
        if(intResult-10>0){
            textView.setText("クリア");
            difficulty=intResult-10;
        }
        else{
            textView.setText("失敗");
            difficulty=intResult;
        }
    }
    public void retry(View v){
        Intent intent2=new Intent(this,brickBreakerActivity.class);
        intent2.putExtra("difficulty", String.valueOf(difficulty));
        startActivity(intent2);
    }
    public void reselect(View v){
        Intent intent2=new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}