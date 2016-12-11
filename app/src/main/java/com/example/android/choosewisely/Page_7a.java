package com.example.android.choosewisely;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page_7a extends AppCompatActivity {
    int score;


    private MediaPlayer play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7a);

        //gets score value from previous page, saves it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);

        //sets textview on this page to display the score value
        TextView scoreText = (TextView) findViewById(R.id.score_text);
        scoreText.setText("Score: " + score);

        play = MediaPlayer.create(this, R.raw.tada);
        play.start();
    }
}
