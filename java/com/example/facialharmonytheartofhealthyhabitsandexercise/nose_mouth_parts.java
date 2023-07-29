package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class nose_mouth_parts extends MainActivity {

    private TextView back;

    private FrameLayout fexternal, finternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_mouth_parts);

        back = findViewById(R.id.parts_back);
        fexternal = findViewById(R.id.frame_external);
        finternal = findViewById(R.id.frame_internal);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_parts.this, nose_mouth_dashboard.class));
            }
        });

        fexternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_parts.this, nose_mouth_external.class));
            }
        });

        finternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_parts.this, nose_mouth_internal.class));
            }
        });
    }
}