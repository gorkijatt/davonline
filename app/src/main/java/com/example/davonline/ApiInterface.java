package com.example.davonline;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @GET("/photos")
    Call<List<UserModel>> getUsers();


    @FormUrlEncoded
    @POST ("/dav/myxml.php")
    Call<Login> getData(@Field("mode") String mode,@Field("username") String username,@Field("password") String password,@Field("a") String a,@Field("producttype") String pt);
}
