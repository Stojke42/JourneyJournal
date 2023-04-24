package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Bundle bundle = getIntent().getExtras();
        int secret_key = getIntent().getIntExtra("SECRET_KEY",0);



    }
}