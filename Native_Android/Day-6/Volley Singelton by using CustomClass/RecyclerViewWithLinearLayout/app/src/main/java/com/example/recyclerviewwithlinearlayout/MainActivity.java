package com.example.recyclerviewwithlinearlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclercontact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  // important to remember

//        ContactModel model=new ContactModel(R.drawable.contact,"Harshit Verma","+91 870000000057");
        arrContacts.add(new ContactModel(R.drawable.r,"Harshit Verma","+91 8756567457"));
        arrContacts.add(new ContactModel(R.drawable.c,"Ramavtaar Kanaujiya","+91 8745567457"));
        arrContacts.add(new ContactModel(R.drawable.d,"Mohit Verma","+91 4234369857"));
        arrContacts.add(new ContactModel(R.drawable.a,"Aniket Jaishwal","+91 2342432344"));
        arrContacts.add(new ContactModel(R.drawable.e,"Radhika Verma","+91 2342343232"));
        arrContacts.add(new ContactModel(R.drawable.f,"Shivam chaubey","+91 6464465664"));
        arrContacts.add(new ContactModel(R.drawable.g,"Harshdeep Verma","+91 4647687667"));
        arrContacts.add(new ContactModel(R.drawable.n,"Shubham Dwivedi","+91 6776867867"));
        arrContacts.add(new ContactModel(R.drawable.i,"Abhinav Maurya","+91 5756674566"));
        arrContacts.add(new ContactModel(R.drawable.j,"Abhishek Singh","+91 4645643242"));
        arrContacts.add(new ContactModel(R.drawable.k,"Ajay Pal","+91 3534676567"));
        arrContacts.add(new ContactModel(R.drawable.l,"Indrajeet Kumar","+91 4564735765"));
        arrContacts.add(new ContactModel(R.drawable.m,"Aditya sharma","+91 7658875544"));
        arrContacts.add(new ContactModel(R.drawable.h,"Asha Verma","+91 4746743636"));
        arrContacts.add(new ContactModel(R.drawable.o,"Surbhi Yadav","+91 4756777346"));
        arrContacts.add(new ContactModel(R.drawable.b,"Satya Prakash","+91 9756745344"));
        arrContacts.add(new ContactModel(R.drawable.q,"Pushpendra Singh","+91 3646687355"));
        arrContacts.add(new ContactModel(R.drawable.p,"Arya Gupta","+91 3578657354"));
        arrContacts.add(new ContactModel(R.drawable.s,"Rajat Sharma","+91 8756475665"));

        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContacts);  // Ye Data set hone ke baad hi call hoga.
        recyclerView.setAdapter(adapter);

    }
}