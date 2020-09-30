package com.example.corona.Main;

import com.example.corona.Main.Main;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @Headers({"Content-Type:application/json","Authorization:apikey 7huZQ0yhbXOJxCA9eL8x5j:1kFKVJ2LaB8pgJDa5zc5cS"})
    @GET("/corona/countriesData")
    Call<Main> getPosts(@Query("data.country")String country); // ??


}
