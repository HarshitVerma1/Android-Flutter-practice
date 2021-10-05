package com.practice.tapmeforchitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainChatActivity extends AppCompatActivity {

    private String myUserName;
    private ListView myChatListView;
    private EditText myChatText;
    private ImageButton mySendChatButton;
    private DatabaseReference myDatabaseRef;
    private ChatListAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chat);
        setUpDisplayName();
        myDatabaseRef = FirebaseDatabase.getInstance().getReference();

        //Get UI elements refs
        myChatListView=findViewById(R.id.chat_list_view);
        myChatText=findViewById(R.id.messageInput);
        mySendChatButton=findViewById(R.id.sendButton);
    }

    //Push chat to FireBase
    private void pushChatToFireBase(){
        String chatInput=myChatText.getText().toString();
        if(!chatInput.equals(""))
        {
            InstantMessage chat =new InstantMessage(chatInput,myUserName);
            myDatabaseRef.child("chats").push().setValue(chat);
            myChatText.setText("");
        }
    }


    // Set UserName for user
    private void setUpDisplayName()
    {
        SharedPreferences prefs=getSharedPreferences(RegisterActivity.CHAT_PREF,MODE_PRIVATE);
        myUserName=prefs.getString(RegisterActivity.DISPLAY_NAME,null);
        if(myUserName==null)
        {
            myUserName="user";
        }
    }


}
