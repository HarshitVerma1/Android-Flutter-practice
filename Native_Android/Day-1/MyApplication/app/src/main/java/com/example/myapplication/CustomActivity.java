package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    findViewById(R.id.myText2).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v1) {
            Intent backIntent =new Intent(CustomActivity.this,CustomActivity2.class);
            startActivity(backIntent);
        }
    });

    }
}