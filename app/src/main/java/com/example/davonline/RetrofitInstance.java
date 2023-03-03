package com.example.davonline;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitInstance {

    public static RetrofitInstance instance;
    ApiInterface apiInterface;
    String api = "https://wallha.com/";

    RetrofitInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }


    public static  RetrofitInstance getInstance(){
        if(instance==null){
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
