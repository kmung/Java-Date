/*
Author: Khawm Mung
Program: Java Date
Description: Main activity for the app
 */
package edu.oru.cit352.ckmung1.javadate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initHomeBtn();

        // call the matches init btn
        initMatchesBtn();

        initChatsBtn();

        initProfileBtn();
    }

    private void initHomeBtn() {
        ImageButton ibHome = findViewById(R.id.imageButtonHome);
        ibHome.setEnabled(false);
    }

    // matches screen init button
    private void initMatchesBtn() {
        ImageButton ibMatches = findViewById(R.id.imageButtonHeart);
        ibMatches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MatchesActivity.class);
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
                Intent intent = new Intent(MainActivity.this, ChatsActivity.class);
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
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}