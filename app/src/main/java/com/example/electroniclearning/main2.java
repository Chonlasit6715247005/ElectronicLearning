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

public class main2 extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnBack = findViewById(R.id.button6);
        btnBack.setOnClickListener(v -> {
            finish();
        });
        logo = findViewById(R.id.imageView24);
        logo.setImageResource(R.drawable.motordchobbygear);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),motordchobbygear.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView25);
        logo.setImageResource(R.drawable.piezo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),piezo.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView26);
        logo.setImageResource(R.drawable.infraredremotecontrol);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),infraredremotecontrol.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView27);
        logo.setImageResource(R.drawable.display7segmentcommonanode);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),display7segmentcommonanode.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView28);
        logo.setImageResource(R.drawable.displaylcd16x2);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),displaylcd16x2.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView29);
        logo.setImageResource(R.drawable.multimeter);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),multimeter.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView30);
        logo.setImageResource(R.drawable.powersupply);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),powersupply.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView31);
        logo.setImageResource(R.drawable.functiongenerator);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),functiongenerator.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView32);
        logo.setImageResource(R.drawable.oscilloscope);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),oscilloscope.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView33);
        logo.setImageResource(R.drawable.resistor);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),resistor.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView34);
        logo.setImageResource(R.drawable.capacitor);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),capacitor.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView35);
        logo.setImageResource(R.drawable.capacitorpolarized);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),capacitorpolarized.class);
                startActivity(aboutMe);
            }
        });
    }
}