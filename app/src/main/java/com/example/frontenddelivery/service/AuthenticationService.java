package com.example.frontenddelivery.service;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class AuthenticationService {
    private Retrofit retrofit = RetrofitClient.getInstance("http://10.0.0.11/");
    private IAuthenticationService iAuthenticationService = retrofit.create(IAuthenticationService.class);

    public void login(String username, String password, Callback<String> stringCallback) {
       iAuthenticationService.login(username, password) .enqueue(stringCallback);
    }
}
