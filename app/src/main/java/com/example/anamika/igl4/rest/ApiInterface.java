package com.example.anamika.igl4.rest;

import com.example.anamika.igl4.model.LoginFieldResponce;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("amrs_igl_api/webservice.asmx/login")
    Call<List<LoginFieldResponce>> sendLoginCredential
            (@Query("Uid") String User_ID,
             @Query("pwd") String pwd);
}
