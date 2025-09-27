package com.example.electroniclearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class main1 extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnBack = findViewById(R.id.button4);
        btnBack.setOnClickListener(v -> {
            finish();
        });
        logo = findViewById(R.id.imageView12);
        logo.setImageResource(R.drawable.neopixel24);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixel24.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView13);
        logo.setImageResource(R.drawable.neopixelstrip4);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip4.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView14);
        logo.setImageResource(R.drawable.neopixelstrip6);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip6.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView15);
        logo.setImageResource(R.drawable.neopixelstrip8);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip8.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView16);
        logo.setImageResource(R.drawable.neopixelstrip10);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip10.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView17);
        logo.setImageResource(R.drawable.neopixelstrip12);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip12.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView18);
        logo.setImageResource(R.drawable.neopixelstrip16);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip16.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView19);
        logo.setImageResource(R.drawable.neopixelstrip20);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixelstrip20.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView20);
        logo.setImageResource(R.drawable.motorvibration);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),motorvibration.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView21);
        logo.setImageResource(R.drawable.motordcarduinokit);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),motordcarduinokit.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView22);
        logo.setImageResource(R.drawable.motordcencodersmall);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),motordcencodersmall.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView23);
        logo.setImageResource(R.drawable.motorservodfrobotkit);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),motorservodfrobotkit.class);
                startActivity(aboutMe);
            }
        });
    }
}