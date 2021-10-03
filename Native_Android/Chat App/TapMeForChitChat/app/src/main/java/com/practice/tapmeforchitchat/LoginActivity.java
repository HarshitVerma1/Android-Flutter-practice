package com.practice.tapmeforchitchat;

import android.app.AlertDialog;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth myAuth;
    private EditText myEmail;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        myEmail=findViewById(R.id.login_email);
        password=findViewById(R.id.login_password);
        // Get firebase instance
        myAuth=FirebaseAuth.getInstance();
    }

    public void signnedin(View view)
    {
        loginUser();
    }

    private void loginUser()
    {
        myEmail.setError(null);
        password.setError(null);
        String email=myEmail.getText().toString();
        String passwd=password.getText().toString();
        boolean cancel=false;
        View focusView=null;
        if (!TextUtils.isEmpty(passwd) && !checkPassword(passwd)) {
            password.setError(getString(R.string.invalid_password));
            focusView=password;
        }
        if (!TextUtils.isEmpty(email) && !checkEmail(email)) {
            myEmail.setError(getString(R.string.invalid_Email));
            focusView=myEmail;
            cancel=true;
        }
        if(cancel)
        {
            focusView.requestFocus();
        }
        else {
            signinUser();
        }
    }


    private boolean checkEmail(String email)
    {
        return email.contains("@");
    }
    private boolean checkPassword(String passwd)
    {
        return passwd.length()>6;
    }
    //Login User With FireBase
    private void loginWithFirebase()
    {
        String myemail=myEmail.getText().toString();
        String passwd=password.getText().toString();

    }


    private void signinUser(){
        String email=myEmail.getText().toString();
        String passwd=password.getText().toString();
        if (email.equals("") || passwd.equals("")){
            return;
        }
        Toast.makeText(getApplicationContext(), "Logging you in ... ", Toast.LENGTH_SHORT).show();
        myAuth.signInWithEmailAndPassword(email,passwd).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful())
                {
                    showErrorBox("Entered Credentials are incorrect !");
                    Log.i("FIND CODE","User Creation was: "+task.getException());

                }else
                {
                    Toast.makeText(getApplicationContext(), "LoggedIn Successfully !!", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(LoginActivity.this,MainChatActivity.class);
                    finish();
                    startActivity(intent);
                }

            }
        });
    }


    public void showErrorBox(String message)
    {
//*Create a ErrorBox for error
        new AlertDialog.Builder(this)
                .setTitle("Heyyy")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok,null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void openRegiterActivity(View view)
    {
        Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
        finish();
        startActivity(intent);
    }

}