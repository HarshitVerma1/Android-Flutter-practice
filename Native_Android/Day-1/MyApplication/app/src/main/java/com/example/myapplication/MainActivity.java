 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Hi Harshit , onCreate is Called.",Toast.LENGTH_SHORT).show();
        /**
         * without .show() it would not work.
         */
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,CustomActivity.class);
//                startActivity(intent);
                findViewById(R.id.LinearLayout1).setBackgroundColor(Color.DKGRAY);
                Toast.makeText(MainActivity.this,"Button Touched", Toast.LENGTH_SHORT).show();

            }
        });
        findViewById(R.id.LinearLayout1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.LinearLayout1).setBackgroundColor(Color.WHITE);
                Toast.makeText(MainActivity.this,"LinearLayout Touched",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.nextActivityScreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Main Activity Launched",Toast.LENGTH_SHORT).show();
                Intent nextScreen=new Intent(MainActivity.this,CustomActivity.class);
                startActivity(nextScreen);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart() is called.",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume() is Called.",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause() is Called.",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop() is Called.",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy() is Called.",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart() is Called.",Toast.LENGTH_SHORT).show();


    }
    public void buttonIsClicked(View buttonView){
        buttonView.setBackgroundColor(Color.MAGENTA);
    }

}