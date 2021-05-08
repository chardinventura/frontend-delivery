package com.example.frontenddelivery.service;

import com.example.frontenddelivery.model.User;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class UserService {
    private Retrofit retrofit = RetrofitClient.getInstance("http://10.0.2.2/");
    private IUserService iUserService = retrofit.create(IUserService.class);

    public void insert(User user, Callback<User> userCallback) {
        iUserService.insert(user).enqueue(userCallback);
    }
}
