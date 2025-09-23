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

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    Button page1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        logo = findViewById(R.id.imageView);
        logo.setImageResource(R.drawable.npn);
                logo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent aboutMe = new Intent(getApplicationContext(),SecondActivity.class);
                        startActivity(aboutMe);
                    }
                });
        logo = findViewById(R.id.imageView1);
        logo.setImageResource(R.drawable.pnp);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),pnp.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView2);
        logo.setImageResource(R.drawable.nmos);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),nmos.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView3);
        logo.setImageResource(R.drawable.pmos);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),pmos.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView4);
        logo.setImageResource(R.drawable.spdt);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),spdt.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView5);
        logo.setImageResource(R.drawable.dpdt);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),dpdt.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView6);
        logo.setImageResource(R.drawable.led);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),led.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView7);
        logo.setImageResource(R.drawable.ledrgb);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),ledrgb.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView8);
        logo.setImageResource(R.drawable.light);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),light.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView9);
        logo.setImageResource(R.drawable.neopixel);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixel.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView10);
        logo.setImageResource(R.drawable.neopixel12);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixel12.class);
                startActivity(aboutMe);
            }
        });
        logo = findViewById(R.id.imageView11);
        logo.setImageResource(R.drawable.neopixel16);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),neopixel16.class);
                startActivity(aboutMe);
            }
        });
        page1 = findViewById(R.id.button3);
        page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutMe = new Intent(getApplicationContext(),main1.class);
                startActivity(aboutMe);
            }
        });

    }
}