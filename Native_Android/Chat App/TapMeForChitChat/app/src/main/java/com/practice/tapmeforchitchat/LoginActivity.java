package com.practice.tapmeforchitchat;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

    }
    public void openRegiterActivity(View view)
    {
        Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
        finish();
        startActivity(intent);
    }
}