package com.example.jsonproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Student {
    @SerializedName("Student Name")
    private  String name;
    @SerializedName("Count")
    private int courseCount;
    @SerializedName("email")
    private String email;
    @SerializedName("Course")
    private Course mCourse;
    private List<Video> mVideo;

    public Student(String name, int courseCount, String email,Course course,List<Video> video) {
        this.name = name;
        this.courseCount = courseCount;
        this.email = email;
        mCourse = course;
        mVideo=video;
    }
}
