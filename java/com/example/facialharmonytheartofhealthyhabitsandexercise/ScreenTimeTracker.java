package com.example.facialharmonytheartofhealthyhabitsandexercise;

public class ScreenTimeTracker {

    private long startTime;

    private long endTime;

    public void startScreenTimeTracking() {
        startTime = System.currentTimeMillis();
    }

    public long stopScreenTimeTracking() {
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
