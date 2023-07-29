package com.example.facialharmonytheartofhealthyhabitsandexercise;

public class ScreenTimeManager {

    private static ScreenTimeManager instance;
    private ScreenTimeTracker screenTimeTracker;

    private ScreenTimeManager() {
        screenTimeTracker = new ScreenTimeTracker();
    }

    public static synchronized ScreenTimeManager getInstance() {
        if (instance == null) {
            instance = new ScreenTimeManager();
        }
        return instance;
    }

    public void startScreenTimeTracking() {
        screenTimeTracker.startScreenTimeTracking();
    }

    public long stopScreenTimeTracking() {
        return screenTimeTracker.stopScreenTimeTracking();
    }


}
