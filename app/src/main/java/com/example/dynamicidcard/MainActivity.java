package com.example.dynamicidcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView email_id = findViewById(R.id.email_id);
        ImageView fb_id = findViewById(R.id.fb_id);
        ImageView phone_id = findViewById(R.id.phone_id);
        ImageView whatsapp_id = findViewById(R.id.whatsapp_id);
        ImageView linkedin_id = findViewById(R.id.linkedin_id);
        ImageView github_id = findViewById(R.id.github_id);

        email_id.setOnClickListener(v -> {
            Intent intent_email = new Intent(Intent.ACTION_SENDTO);
            intent_email.setData(Uri.parse("mailto:rimonraian2@gmail.com"));
            startActivity(intent_email);
        });

        phone_id.setOnClickListener(v -> {
            Intent intent_phone = new Intent(Intent.ACTION_DIAL);
            intent_phone.setData(Uri.parse("tel:01781431402"));
            startActivity(intent_phone);
        });

        fb_id.setOnClickListener(v -> {
            Intent intent_fb = new Intent(Intent.ACTION_VIEW);
            intent_fb.setData(Uri.parse("https://www.facebook.com/rr.rimon/"));
            startActivity(intent_fb);
        });

        linkedin_id.setOnClickListener(v -> {
            Intent intent_linkedin = new Intent(Intent.ACTION_VIEW);
            intent_linkedin.setData(Uri.parse("https://www.linkedin.com/in/raian-rashid-rimon-27b0b5225/"));
            startActivity(intent_linkedin);
        });

        github_id.setOnClickListener(v -> {
            Intent intent_github = new Intent(Intent.ACTION_VIEW);
            intent_github.setData(Uri.parse("https://github.com/RaianRashidRimon"));
            startActivity(intent_github);
        });

        whatsapp_id.setOnClickListener(v -> {
            Intent intent_instagram = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/rimon_lemon/"));
            startActivity(intent_instagram);
        });
    }

    private void enableEdgeToEdge() {
        // Add the enableEdgeToEdge logic here, if you have implemented it elsewhere in your Kotlin version.
    }
}
