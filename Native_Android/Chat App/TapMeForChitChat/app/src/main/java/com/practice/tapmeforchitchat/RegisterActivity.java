package com.practice.tapmeforchitchat;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    public static final String CHAT_PREF="ChatPref";
    public static final String DISPLAY_NAME="UserName";

    public AutoCompleteTextView myUserNameView;
    public EditText myEmail;
    public EditText myPassword;
    public EditText myPasswordConfirm;

//    FireBase Reference
    private FirebaseAuth myAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myEmail=findViewById(R.id.register_email);
        myUserNameView=findViewById(R.id.register_user_name);
        myPassword=findViewById(R.id.register_password);
        myPasswordConfirm=findViewById(R.id.register_confirm_password);

        //get a hold of firebase instance
        myAuth=FirebaseAuth.getInstance();
    }

    public void registerSignUp(View view)
    {
        registerUser();
    }

    // Actual registration happens here
    private void registerUser()
    {
        myEmail.setError(null);
        myPassword.setError(null);
        String email=myEmail.getText().toString();
        String passwd=myPassword.getText().toString();
        boolean cancel=false;
        View focusView=null;
        if (!TextUtils.isEmpty(passwd) && !checkPassword(passwd)) {
            myPassword.setError(getString(R.string.invalid_password));
            focusView=myPassword;
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
            createUser();
        }


    }

    /**
     * Validation for existing Email and password length and
     * another Validation methods which is really very useful for proper registration.
      */
    private boolean checkEmail(String email)
    {
        return email.contains("@");
    }
    private boolean checkPassword(String passwd)
    {
        String confirmedPassword=myPasswordConfirm.getText().toString();
        return passwd.equals(confirmedPassword) && passwd.length()>6;
    }



//    SignUp a user at Firebase
    private void createUser()
    {
        String email=myEmail.getText().toString();
        String password=myPassword.getText().toString();
// call methods from Firebase
        myAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                // DELETE before production
                if (!task.isSuccessful())
                {
                    showErrorBox("Ooops Registration Failed !");
                }else
                {
                    saveUserName();
                    Toast.makeText(getApplicationContext(), "Registered Successfully !!", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(RegisterActivity.this,LoginActivity.class);
                    finish();
                    startActivity(intent);
                }
                Log.d("FIND CODE","User Creation was: "+task.isSuccessful());
            }
        });
    }

//    Used SharedPreferences for Usernames
    private void saveUserName()
    {
        String userName =myUserNameView.getText().toString();
        SharedPreferences pref=getSharedPreferences(CHAT_PREF,0);
        pref.edit().putString(DISPLAY_NAME,userName).apply();

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
}