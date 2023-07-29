package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class morning_nigth_routines extends MainActivity {

    private TextView back;

    VideoView morning1, morning2, morning3;

    VideoView night1, night2, night3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_nigth_routines);

        back = findViewById(R.id.rou_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(morning_nigth_routines.this, morning_night_homepage.class));
            }
        });

        morning1 = findViewById(R.id.v_morning1);
        morning1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.morning1);

        MediaController mediaControllerdosmor1 = new MediaController(this);
        morning1.setMediaController(mediaControllerdosmor1);
        mediaControllerdosmor1.setAnchorView(morning1);

        morning2 = findViewById(R.id.v_morning2);
        morning2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.morning2);

        MediaController mediaControllerdosmor2 = new MediaController(this);
        morning2.setMediaController(mediaControllerdosmor2);
        mediaControllerdosmor2.setAnchorView(morning2);

        morning3 = findViewById(R.id.v_morning3);
        morning3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.morning3);

        MediaController mediaControllerdosmor3 = new MediaController(this);
        morning3.setMediaController(mediaControllerdosmor3);
        mediaControllerdosmor3.setAnchorView(morning3);

        night1 = findViewById(R.id.v_nigth1);
        night1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.night1);

        MediaController mediaControllernigth1 = new MediaController(this);
        night1.setMediaController(mediaControllernigth1);
        mediaControllernigth1.setAnchorView(night1);

        night2 = findViewById(R.id.v_nigth2);
        night2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.night2);

        MediaController mediaControllernigth2 = new MediaController(this);
        night2.setMediaController(mediaControllernigth2);
        mediaControllernigth2.setAnchorView(night2);

        night3 = findViewById(R.id.v_nigth3);
        night3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.night3);

        MediaController mediaControllernigth3 = new MediaController(this);
        night3.setMediaController(mediaControllernigth3);
        mediaControllernigth3.setAnchorView(night3);
    }
}