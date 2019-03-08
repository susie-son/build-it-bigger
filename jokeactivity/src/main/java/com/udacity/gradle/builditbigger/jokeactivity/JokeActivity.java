package com.udacity.gradle.builditbigger.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke-extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeView = findViewById(R.id.joke_view);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(JOKE_EXTRA)) {
            jokeView.setText(intent.getStringExtra(JOKE_EXTRA));
        }
    }

}
