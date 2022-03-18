package com.example.gaametiime.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gaametiime.R;

public class SIgnInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void createAccount(View view) {
        startActivity(new Intent(SIgnInActivity.this,
                LoginActivity.class));
    }
}