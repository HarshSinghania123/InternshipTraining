package com.example.interntraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pl.droidsonroids.gif.GifImageView;

public class ActivityPage2 extends AppCompatActivity {

    GifImageView statusGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        statusGif = findViewById(R.id.gifImage);
        String status = getIntent().getExtras().getString("buttonName");
        if (status.equalsIgnoreCase("win")){
            statusGif.setImageResource(R.drawable.win);
        }

        if (status.equalsIgnoreCase("out")){
            statusGif.setImageResource(R.drawable.out);
        }
    }
}