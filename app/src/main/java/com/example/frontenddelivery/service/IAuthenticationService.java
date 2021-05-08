package com.example.frontenddelivery.service;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IAuthenticationService {
    @POST("login")
    Call<String> login(@Query("username") String username, @Query("password") String password);
}
