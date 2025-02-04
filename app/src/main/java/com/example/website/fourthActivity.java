package com.example.website;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class fourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        Button backtomain = findViewById(R.id.backtomain);
        backtomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthActivity.this, secondActivity.class);
                startActivity(intent);
            }
        });

        Button aboutus = findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthActivity.this, thirdActivity.class);
                startActivity(intent);
            }
        });

        Button contact = findViewById(R.id.contacts);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}

