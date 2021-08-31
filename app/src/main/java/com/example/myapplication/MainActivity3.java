package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void inicio (View v){
        Intent i = new Intent(this, MainActivityInicio.class);
        startActivity(i);

        EditText edituserEmail = findViewById(R.id.editUserEmail);
        EditText edituserName = findViewById(R.id.editUserName);
        EditText edituserPassword = findViewById(R.id.editPassword);

        String userName = edituserName.getText().toString();
        String userEmail = edituserEmail.getText().toString();
        String userPassword = edituserPassword.getText().toString();

        i.putExtra("extra_userName", userName);
        i.putExtra("extra_userEmail", userEmail);
        i.putExtra("extra_userPassword", userPassword);

        startActivity(i);
    }
}