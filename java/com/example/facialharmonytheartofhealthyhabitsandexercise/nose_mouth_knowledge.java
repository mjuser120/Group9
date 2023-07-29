package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class nose_mouth_knowledge extends MainActivity {

    private TextView back;

    VideoView nose1, nose2, nose3;

    VideoView mouth1, mouth2, mouth3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_mouth_knowledge);

        back = findViewById(R.id.dash_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nose_mouth_knowledge.this, nose_mouth_dashboard.class));
            }
        });

        nose1 = findViewById(R.id.v_nose1);
        nose1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.nose1);

        MediaController mediaControllerdosnose1 = new MediaController(this);
        nose1.setMediaController(mediaControllerdosnose1);
        mediaControllerdosnose1.setAnchorView(nose1);

        mouth1 = findViewById(R.id.v_mouth1);
        mouth1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.mouth1);

        MediaController mediaControllerdosmouth1 = new MediaController(this);
        mouth1.setMediaController(mediaControllerdosmouth1);
        mediaControllerdosmouth1.setAnchorView(mouth1);

        mouth2 = findViewById(R.id.v_mouth2);
        mouth2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.mouth2);

        MediaController mediaControllerdosmouth2 = new MediaController(this);
        mouth2.setMediaController(mediaControllerdosmouth2);
        mediaControllerdosmouth2.setAnchorView(mouth2);

        mouth3 = findViewById(R.id.v_mouth3);
        mouth3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.mouth3);

        MediaController mediaControllerdosmouth3 = new MediaController(this);
        mouth3.setMediaController(mediaControllerdosmouth3);
        mediaControllerdosmouth3.setAnchorView(mouth3);

    }
}