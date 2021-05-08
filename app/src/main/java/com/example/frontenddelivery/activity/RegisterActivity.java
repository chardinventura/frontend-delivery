package com.example.frontenddelivery.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.frontenddelivery.R;
import com.example.frontenddelivery.model.User;
import com.example.frontenddelivery.service.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private ImageButton ibAvatar;
    private EditText etFirstname;
    private EditText etLastname;
    private EditText etUsername;
    private EditText etPhone;
    private EditText etPassword;
    private EditText etRepeatPassword;
    private Button bRegister;
    private UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ibAvatar = findViewById(R.id.ibAvatar);
        etFirstname = findViewById(R.id.etFirstname);
        etLastname = findViewById(R.id.etLastname);
        etUsername = findViewById(R.id.etUsername);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        etRepeatPassword = findViewById(R.id.etRepeatPassword);
        bRegister = findViewById(R.id.bRegister);
        userService = new UserService();

        bRegister.setOnClickListener(view ->
                insertUser());
    }

    private void insertUser() {

        User user = new User(null,
                (byte) 0,
                etFirstname.getText().toString(),
                etLastname.getText().toString(),
                etUsername.getText().toString(),
                etPhone.getText().toString(),
                etPassword.getText().toString());

        userService.insert(user, new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(RegisterActivity.this, response.message(), Toast.LENGTH_LONG) .show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, t.getMessage(), Toast.LENGTH_LONG) .show();
            }
        });
    }

    private boolean isPasswordValid(String password, String repeatPassword) {
        if (password.isEmpty() || repeatPassword.isEmpty())
            return false;
        if (!password.equals(repeatPassword))
            return false;

        return true;
    }
}
