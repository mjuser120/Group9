package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class eye_ear_cause_effect extends MainActivity {

    private TextView back;

    VideoView caeeye1, caeeye2;

    VideoView caeear1, caeear2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ear_cause_effect);

        back = findViewById(R.id.cf_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ear_cause_effect.this, eye_ears_homepage.class));
            }
        });

        caeeye1 = findViewById(R.id.cae_eye1);
        caeeye1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_eyes1);

        MediaController mediaControllereye1 = new MediaController(this);
        caeeye1.setMediaController(mediaControllereye1);
        mediaControllereye1.setAnchorView(caeeye1);

        caeeye2 = findViewById(R.id.cae_eye2);
        caeeye2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_eyes2);

        MediaController mediaControllereye2 = new MediaController(this);
        caeeye2.setMediaController(mediaControllereye2);
        mediaControllereye2.setAnchorView(caeeye2);

        caeear1 = findViewById(R.id.cae_ear1);
        caeear1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_ears1);

        MediaController mediaControllerear1 = new MediaController(this);
        caeear1.setMediaController(mediaControllerear1);
        mediaControllerear1.setAnchorView(caeear1);

        caeear2 = findViewById(R.id.cae_ear2);
        caeear2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cae_ears2);

        MediaController mediaControllerear2 = new MediaController(this);
        caeear2.setMediaController(mediaControllerear2);
        mediaControllerear2.setAnchorView(caeear2);
    }
}