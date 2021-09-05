package com.example.myapihandlingwithvolley;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingletonCustomClass {
    private static VolleySingletonCustomClass mInstance;
    private static RequestQueue mRequestQueue;

    public VolleySingletonCustomClass(Context context) {
        mRequestQueue= Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingletonCustomClass getInstance(Context context ){
        if (mInstance == null) {
            mInstance=new VolleySingletonCustomClass(context);
        }
        return mInstance;
    }
    public RequestQueue getRequestQueue()
    {
        return mRequestQueue;
    }
}
