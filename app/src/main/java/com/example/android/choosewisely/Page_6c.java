package com.example.android.choosewisely;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page_6c extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6c);

        //gets score value from previous page and sets it to local score variable
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int", 0);

        //sets textview on this page to include the score
        TextView scoreText = (TextView) findViewById(R.id.score_text);
        scoreText.setText("Score: " + score);
    }
}

