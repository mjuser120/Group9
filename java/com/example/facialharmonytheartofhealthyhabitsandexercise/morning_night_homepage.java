package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class morning_night_homepage extends MainActivity {

    private TextView back;

    private Button btnroutines, btncf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_night_homepage);

        back = findViewById(R.id.sun_moon_back);

        btnroutines = findViewById(R.id.btn_routines);
        //btncf = findViewById(R.id.btn_cause_effect);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(morning_night_homepage.this, MainActivity.class));
            }
        });

        btnroutines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(morning_night_homepage.this, morning_nigth_routines.class));
            }
        });
    }
}