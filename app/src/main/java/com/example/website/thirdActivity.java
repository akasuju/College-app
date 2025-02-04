package com.example.website;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class thirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);

        Button backtomain = findViewById(R.id.backtomain);
        backtomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdActivity.this, secondActivity.class);
                startActivity(intent);
            }
        });

        Button services = findViewById(R.id.services);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdActivity.this, fourthActivity.class);
                startActivity(intent);
            }
        });

        Button contact = findViewById(R.id.contacts);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}

