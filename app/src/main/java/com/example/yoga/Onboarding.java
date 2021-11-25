package com.example.yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }

    public void SignUpClick(View view) {
        Intent sign = new Intent(Onboarding.this, Login.class);
        startActivity(sign);
    }
}