package com.example.frontenddelivery.service;

import com.example.frontenddelivery.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IUserService {
    @POST("v1/users")
    Call<User> insert(@Body User user);
}
