package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getName();
    private static final int SECRET_KET=99;

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.edittextusername);
        password=findViewById(R.id.edittextpassword);
    }

    public void login(View view) {


        String usernamestr = username.getText().toString();
        String passwordstr = password.getText().toString();

        Log.i("MainActivity","Bejelentkezet"+usernamestr+passwordstr);

    }

    public void signup(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        intent.putExtra("SECRET_KEY",99);
        startActivity(intent);
    }
}