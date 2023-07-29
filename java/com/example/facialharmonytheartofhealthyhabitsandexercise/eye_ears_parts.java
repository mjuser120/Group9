package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class eye_ears_parts extends MainActivity {

    private TextView back;

    private FrameLayout btnexternal, btninternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ears_parts);

        back = findViewById(R.id.parts_back);
        btnexternal = findViewById(R.id.frame_external);
        btninternal = findViewById(R.id.frame_internal);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_parts.this, eye_ears_homepage.class));
            }
        });

        btnexternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_parts.this, eye_ears_external.class));
            }
        });

        btninternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_parts.this, eye_ears_internal.class));
            }
        });
    }
}