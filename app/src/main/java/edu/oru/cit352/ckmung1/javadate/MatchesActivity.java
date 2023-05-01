package edu.oru.cit352.ckmung1.javadate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MatchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matches_layout);

        initChatsBtn();
        initMatchesBtn();
        initHomeBtn();
        initProfileBtn();
    }

    private void initHomeBtn() {
        ImageButton ibHome = findViewById(R.id.imageButtonHome);
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatchesActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // matches screen init button
    private void initMatchesBtn() {
        ImageButton ibMatches = findViewById(R.id.imageButtonHeart);
        ibMatches.setEnabled(false);
    }

    // matches screen init button
    private void initChatsBtn() {
        ImageButton ibChats = findViewById(R.id.imageButtonChat);
        ibChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatchesActivity.this, ChatsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    // matches screen init button
    private void initProfileBtn() {
        ImageButton ibProfile = findViewById(R.id.imageButtonAvatar);
        ibProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MatchesActivity.this, ProfileActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}