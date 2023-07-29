package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eye_ears_homepage extends MainActivity {

    private TextView back;

    private Button btn_Knowledge, btncf, btnparts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_ears_homepage);

        back = findViewById(R.id.dash_back);

        btn_Knowledge = findViewById(R.id.btn_Knowledge);
        btncf = findViewById(R.id.btn_cause_effect);
        btnparts = findViewById(R.id.btn_parts);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_homepage.this, MainActivity.class));
            }
        });

        btnparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_homepage.this, eye_ears_parts.class));
            }
        });

        btn_Knowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_homepage.this, eye_ears_knowledge.class));
            }
        });

        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(eye_ears_homepage.this, eye_ear_cause_effect.class));
            }
        });
    }
}