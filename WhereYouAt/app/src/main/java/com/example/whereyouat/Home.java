package com.example.whereyouat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FloatingActionButton startTrackingBtn = findViewById(R.id.startTrackerBtn);
        startTrackingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Here's a snack bar 1", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton viewOnMapBtn = findViewById(R.id.viewTrackedDataOnMapBtn);
        viewOnMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Here's a snack bar 2", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton stopTrackerBtn = findViewById(R.id.stopTrackerBtn);
        stopTrackerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Here's a snack bar 3", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onConfigurationChanged(Configuration newConfig){
        int currentNightMode = newConfig.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch(currentNightMode){
            case Configuration.UI_MODE_NIGHT_NO:
                Toast.makeText(getApplicationContext(), "Night mode is not active, we're using the light theme", Toast.LENGTH_LONG).show();
                break;

            case Configuration.UI_MODE_NIGHT_YES:
                Toast.makeText(getApplicationContext(), "Night mode is active, we're using dark theme", Toast.LENGTH_SHORT).show();
        }
    }
}
