package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class eye_ears_knowledge extends AppCompatActivity {

    private TextView back;

    VideoView veye1, veye2, veye3;

    VideoView vears1, vears2, vears3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ears_knowledge);

        back = findViewById(R.id.know_back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_knowledge.this, eye_ears_homepage.class));
            }
        });

        veye1 = findViewById(R.id.v_eye1);
        veye1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.eyes1);

        MediaController mediaControllerdoseye1 = new MediaController(this);
        veye1.setMediaController(mediaControllerdoseye1);
        mediaControllerdoseye1.setAnchorView(veye1);

        veye2 = findViewById(R.id.v_eye2);
        veye2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.eyes2);

        MediaController mediaControllerdoseye2 = new MediaController(this);
        veye2.setMediaController(mediaControllerdoseye2);
        mediaControllerdoseye2.setAnchorView(veye2);

        veye3 = findViewById(R.id.v_eye3);
        veye3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.eyes3);

        MediaController mediaControllerdoseye3 = new MediaController(this);
        veye3.setMediaController(mediaControllerdoseye3);
        mediaControllerdoseye3.setAnchorView(veye3);


        vears1 = findViewById(R.id.v_ears1);
        vears1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ears1);

        MediaController mediaControllerdosears1 = new MediaController(this);
        vears1.setMediaController(mediaControllerdosears1);
        mediaControllerdosears1.setAnchorView(vears1);


        vears2 = findViewById(R.id.v_ears2);
        vears2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ears2);

        MediaController mediaControllerdosears2 = new MediaController(this);
        vears2.setMediaController(mediaControllerdosears2);
        mediaControllerdosears1.setAnchorView(vears2);

        vears3 = findViewById(R.id.v_ears3);
        vears3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ears3);

        MediaController mediaControllerdosears3 = new MediaController(this);
        vears3.setMediaController(mediaControllerdosears3);
        mediaControllerdosears1.setAnchorView(vears3);
    }
}