package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class nose_mouth_cause_effect extends MainActivity {

    private TextView back;

     VideoView caenose1, caenose2;

     VideoView ceamouth1, ceamouth2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_mouth_cause_effect);

        back = findViewById(R.id.cf_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_cause_effect.this, nose_mouth_dashboard.class));
            }
        });

        caenose1 = findViewById(R.id.cae_nose1);
        caenose1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_nose1mp4);

        MediaController mediaControllernose1 = new MediaController(this);
        caenose1.setMediaController(mediaControllernose1);
        mediaControllernose1.setAnchorView(caenose1);

        ceamouth1 = findViewById(R.id.cae_mouth1);
        ceamouth1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_mouth1);

        MediaController mediaControllermouth1 = new MediaController(this);
        ceamouth1.setMediaController(mediaControllermouth1);
        mediaControllermouth1.setAnchorView(ceamouth1);
    }
}