package com.example.jsonproject;

import com.google.gson.annotations.SerializedName;

public class Course {
    @SerializedName("Course Name")
    private String mCourseName;
    @SerializedName("Descriptn")
    private String mDescription;

    public Course(String mCourseName, String mDescription) {
        this.mCourseName = mCourseName;
        this.mDescription = mDescription;
    }
}
