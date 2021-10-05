package com.practice.tapmeforchitchat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class ChatListAdapter extends BaseAdapter {

    private Activity myActivity;
    private DatabaseReference myDatabaseRef;
    private String myUserName;
    private ArrayList<DataSnapshot> mySnapshot;

    // Add ChildEventListener form FireBase
    private ChildEventListener myListener=new ChildEventListener() {
        @Override
        public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

        }

        @Override
        public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

        }

        @Override
        public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

        }

        @Override
        public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    };

    //Constructor is important here
    public ChatListAdapter(Activity activity,DatabaseReference ref , String name)
    {
        myActivity=activity;
        myDatabaseRef=ref.child("chats");
        myUserName=name;
        mySnapshot=new ArrayList<>();

        // Add Listener here
        myDatabaseRef.addChildEventListener(myListener);
    }

    /**
     * *Static class Purposes
     *  -  Holding text Views
     */
    static class  ViewHolder{
        TextView senderName;
        TextView chatBody;
        LinearLayout.LayoutParams layoutParams;
    }


    // BaseAdapter overrided Method()
    @Override
    public int getCount() {
        return mySnapshot.size();
    }

    @Override
    public InstantMessage getItem(int i) {  //here 'Object' replaced with defined class 'InstantMessage'
        DataSnapshot snapshot= mySnapshot.get(i);
        return snapshot.getValue(InstantMessage.class);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null)
        {
            //This is full proof way to make sure that you don't get the NullPointerException
            LayoutInflater inflater= (LayoutInflater) myActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  //Casting of LayoutInflater is important
            view=inflater.inflate(R.layout.chat_msg_row,viewGroup,false);
            final ViewHolder holder=new ViewHolder();
            holder.senderName=view.findViewById(R.id.author);
            holder.chatBody=view.findViewById(R.id.message);
            holder.layoutParams=(LinearLayout.LayoutParams)holder.senderName.getLayoutParams();
            view.setTag(holder);
        }
        final InstantMessage message=getItem(i);
        final ViewHolder holder=(ViewHolder) view.getTag();
        //  Styling
        boolean isMe=message.getAuthor().equals(myUserName);
        //call a function for Styling
        chatRowStling(isMe,holder);
        String author = message.getAuthor();
        holder.senderName.setText(author);
        String msg= message.getMessage();
        holder.chatBody.setText(msg);

        return view;
    }
    private void chatRowStling(boolean isItMe,ViewHolder holder)
    {
        if (isItMe) {
            holder.layoutParams.gravity=Gravity.END;
            holder.senderName.setTextColor(Color.BLUE);
            holder.chatBody.setBackgroundResource(R.drawable.speech_bubble_green);
        }
        else
        {
            holder.layoutParams.gravity=Gravity.END;
            holder.senderName.setTextColor(Color.GREEN);
            holder.chatBody.setBackgroundResource(R.drawable.speech_bubble_orange);

        }
    }
    //improve performance for memory stuff (Solve Scrolling issues)
    public void freeUpResources(){
        myDatabaseRef.removeEventListener(myListener);
    }

}
