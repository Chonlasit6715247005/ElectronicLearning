package com.example.electroniclearning;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class motordchobbygear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // ใช้ layout ของ "หน้าอุปกรณ์" ให้ถูกต้อง
        setContentView(R.layout.activity_motordchobbygear);

        // เผื่อ layout ยังไม่มี id=main ก็จะข้ามให้ ไม่พัง
        View main = findViewById(R.id.main);
        if (main != null) {
            ViewCompat.setOnApplyWindowInsetsListener(main, (v, insets) -> {
                Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
                return insets;
            });
        }

        Button btnBack = findViewById(R.id.button);
        btnBack.setOnClickListener(v -> {
            finish();
        });
        }
    }