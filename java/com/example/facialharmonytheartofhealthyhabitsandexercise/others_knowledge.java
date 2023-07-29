package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class others_knowledge extends MainActivity {

    private TextView back;

    VideoView other1, other2, other3, other4, other5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_knowledge);

        back = findViewById(R.id.know_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(others_knowledge.this, MainActivity.class));
            }
        });

        other1 = findViewById(R.id.v_other1);
        other1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.others1);

        MediaController mediaControllerdosother1 = new MediaController(this);
        other1.setMediaController(mediaControllerdosother1);
        mediaControllerdosother1.setAnchorView(other1);

        other2 = findViewById(R.id.v_other2);
        other2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.others2);

        MediaController mediaControllerdosother2 = new MediaController(this);
        other2.setMediaController(mediaControllerdosother2);
        mediaControllerdosother2.setAnchorView(other2);

        other3 = findViewById(R.id.v_other3);
        other3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.others3);

        MediaController mediaControllerdosother3 = new MediaController(this);
        other3.setMediaController(mediaControllerdosother3);
        mediaControllerdosother3.setAnchorView(other3);

        other4 = findViewById(R.id.v_other4);
        other4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.others4);

        MediaController mediaControllerdosother4 = new MediaController(this);
        other4.setMediaController(mediaControllerdosother4);
        mediaControllerdosother4.setAnchorView(other4);

        other5 = findViewById(R.id.v_other5);
        other5.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.others5);

        MediaController mediaControllerdosother5 = new MediaController(this);
        other5.setMediaController(mediaControllerdosother5);
        mediaControllerdosother5.setAnchorView(other5);
    }
}