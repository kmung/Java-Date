package edu.oru.cit352.ckmung1.javadate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        initChatsBtn();
        initHomeBtn();
        initProfileBtn();
        initMatchesBtn();
    }

    private void initHomeBtn() {
        ImageButton ibHome = findViewById(R.id.imageButtonHome);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // matches screen init button
    private void initMatchesBtn() {
        ImageButton ibMatches = findViewById(R.id.imageButtonHeart);
        ibMatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MatchesActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // matches screen init button
    private void initChatsBtn() {
        ImageButton ibChats = findViewById(R.id.imageButtonChat);
        ibChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ChatsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // matches screen init button
    private void initProfileBtn() {
        ImageButton ibProfile = findViewById(R.id.imageButtonAvatar);
        ibProfile.setEnabled(false);
    }
}