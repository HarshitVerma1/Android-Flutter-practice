package com.practice.tapmeforchitchat;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    public static final String CHAT_pref="ChatPref";
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
}