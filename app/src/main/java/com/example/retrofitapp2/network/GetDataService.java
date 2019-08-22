package com.example.retrofitapp2.network;

import com.example.retrofitapp2.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}