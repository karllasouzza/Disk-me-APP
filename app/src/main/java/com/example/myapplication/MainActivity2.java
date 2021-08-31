package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void inicio (View v){
        Intent i = new Intent(this, MainActivityInicio.class);

        EditText edituserName = findViewById(R.id.editEmailLogin);
        EditText edituserPassword = findViewById(R.id.editPasswordLogin);

        String userName = edituserName.getText().toString();
        String userPassword = edituserPassword.getText().toString();

        i.putExtra("extra_userName", userName);
        i.putExtra("extra_userPassword", userPassword);

        startActivity(i);

    }
}