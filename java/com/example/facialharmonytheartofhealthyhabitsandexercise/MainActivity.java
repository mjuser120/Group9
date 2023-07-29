package com.example.facialharmonytheartofhealthyhabitsandexercise;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.Manifest;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    private GifImageView btnother, btnquiz;
    private FrameLayout btneye_ears, btnnose_mouth, btnsun_moon;


    private static final String CHANNEL_ID = "screen_time_channel";

    private ScreenTimeTracker screenTimeTracker;

    private Handler handler = new Handler();
    private boolean isRecordingStarted = false;



    private Runnable screenTimeChecker = new Runnable() {
        @Override
        public void run() {
            if (screenTimeTracker != null) {
                long duration = screenTimeTracker.stopScreenTimeTracking();

                // Check the duration here and send a notification if needed
                if (duration >= 1 * 60 * 1000) { // Check if screen time exceeds 30 minutes
                    showRestNotification();
                }
            }

            // Schedule the next check after a specific interval (e.g., 30 minutes)
            handler.postDelayed(screenTimeChecker, 1 * 60 * 1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnother = findViewById(R.id.btn_others);

        btneye_ears = findViewById(R.id.frame_eye_ears);
        btnnose_mouth = findViewById(R.id.frame_nose_mouth);
        btnsun_moon = findViewById(R.id.frame_sun_moon);

        btnquiz = findViewById(R.id.btn_quiz);


        btneye_ears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, eye_ears_homepage.class));
            }
        });

        btnnose_mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, nose_mouth_dashboard.class));
            }
        });

        btnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, others_knowledge.class));
            }
        });

        btnsun_moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, morning_night_homepage.class));
            }
        });


        screenTimeTracker = new ScreenTimeTracker();

        btnquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quiz();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        screenTimeTracker.startScreenTimeTracking();
        handler.post(screenTimeChecker);
    }

    @Override
    protected void onPause() {
        super.onPause();
        screenTimeTracker.stopScreenTimeTracking();
        handler.removeCallbacks(screenTimeChecker);
    }

    private boolean hasUsageStatsPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AppOpsManager appOps = (AppOpsManager) getSystemService(Context.APP_OPS_SERVICE);
            int mode = appOps.checkOpNoThrow(AppOpsManager.OPSTR_GET_USAGE_STATS, android.os.Process.myUid(), getPackageName());
            return mode == AppOpsManager.MODE_ALLOWED;
        }
        return false;
    }


    private static final int NOTIFICATION_ID = 1;

    private void showRestNotification() {
        // Create an AlertDialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("REST REMINDER");
        builder.setMessage("Take a break and rest your eyes.");

        // Set a positive button for dismissing the dialog
        builder.setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        // Create and show the AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();



        // Create a notification builder
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                .setSmallIcon(R.drawable.hi)
                .setContentTitle("Rest Reminder")
                .setContentText("Take a break and rest your eyes.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);



        // Show the notification
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build());
    }

    public void quiz()
    { android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Are you sure do you want to take the quiz?")
                .setItems(new CharSequence[]{"Yes", "No"}, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                Intent intent1 = new Intent(MainActivity.this, quiz.class);
                                startActivityForResult(intent1, 1);
                                break;
                            case 1:
                                break;
                        }
                    }
                });
        builder.create().show();

    }
}