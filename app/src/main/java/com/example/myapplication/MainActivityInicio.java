package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);

        //Capiturando extras
        String userName;
        String userEmail;
        String userPassword;

        Bundle b = getIntent().getExtras();
        if (b != null) {
            userName = b.getString("extra_userName");
            userEmail = b.getString("extra_userEmail");
            userPassword = b.getString("extra_userPassword");
        }else{
            userName = "Dados Não Fornecidos";
            userEmail = "Dados Não Fornecidos";
            userPassword = "Dados Não Fornecidos";

        }

        //Mostrando extras
        TextView tName = findViewById(R.id.editUserName);
        TextView tEmail = findViewById(R.id.editEmailLogin);
        TextView tPassword = findViewById(R.id.editPassword);

        tName.setText(userName);
        tEmail.setText(userEmail);
        tPassword.setText(userPassword);
    }
}