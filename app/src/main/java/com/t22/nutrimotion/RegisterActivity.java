package com.t22.nutrimotion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText emailET;
    private EditText passwordET;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        emailET = findViewById(R.id.email_et);
        passwordET = findViewById(R.id.password_et);
        registerBtn = findViewById(R.id.register_btn);

        registerBtn.setOnClickListener(v -> {
            String email = emailET.getText().toString().trim();
            String password = passwordET.getText().toString().trim();
        });
    }

    private void registerUser(String email, String password) {
        // add logic to register the user
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Email and password cannot be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        // Show a message that registration is successful
        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();

        // Redirect to another activity after successful registration
        // Intent intent = new Intent(this, AnotherActivity.class);
        // startActivity(intent);
    }
}