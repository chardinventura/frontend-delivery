package com.example.frontenddelivery;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.frontenddelivery.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bLogin).setOnClickListener(view ->
                startActivity(new Intent(this, RegisterActivity.class)));
    }
}