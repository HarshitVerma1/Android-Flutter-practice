package com.example.retrofitpractice2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {
    private final static String BASE_URL="https://reqres.in/api/";
    static Gson gson=new GsonBuilder()
            .setLenient()
            .create();

    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit=new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
