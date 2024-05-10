package com.t22.nutrimotion;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Switch privacySwitch = findViewById(R.id.privacy_tog);
        privacySwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // The toggle is enabled/checked
                // Perform your action here
            } else {
                // The toggle is disabled/unchecked
                // Perform your action here
            }
    });
    }

    public void onClickUpdateDetails(android.view.View view) {
        // Handle button click to update details
    }

    public void onClickNotifSettings(View view) {
        // Handle button click to open notification settings
    }

    public void onClickChangePass(View view) {
        // Handle button click to change password
    }

    public void onClickFAQ(View view) {
        // Handle button click to open FAQ
    }

}