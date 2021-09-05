package com.example.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();
        List<Video> videos= new ArrayList<>();
        videos.add(new Video("Intro",4));
        videos.add(new Video("Gson",7));
        videos.add(new Video("Jason in 1 hr.",9));

//        Student student = new Student("Hitesh",5,"harshitverma14366@gmail.com ");
//        String json=gson.toJson(student);
//        Log.d("Test",json);
//        {"courseCount":5,"email":"harshitverma14366@gmail.com ","name":"Hitesh"}   giving By Debugger Log.d(------)



//            Course course=new Course("Java","Anvanced");
//            Student student=new Student("Radhe",5,"harshitverma14366@gmail.com",course);
//            String jsonFile=gson.toJson(student);
//            Log.d("Text",jsonFile); //{"Count":5,"email":"harshitverma14366@gmail.com","Course":{"Course Name":"Java","Descriptn":"Anvanced"},"Student Name":"Radhe"}


//        String jasonString="{\"Count\":5,\"email\":\"harshitverma14366@gmail.com\",\"Course\":{\"Course Name\":\"Java\",\"Descriptn\":\"Anvanced\"},\"Student Name\":\"Radhe\"}";
//        Student student=gson.fromJson(jasonString,Student.class);
//        Log.d("Test",student.toString());



        Course course=new Course("Java","Anvanced");
        Student student=new Student("Radhe",5,"harshitverma14366@gmail.com",course,videos);
        String jsonFile=gson.toJson(student);
        Log.d("Test",jsonFile);
        //You can see result in test.json file or see in Debug

    }
}