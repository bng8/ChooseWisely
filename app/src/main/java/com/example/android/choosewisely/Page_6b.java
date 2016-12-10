package com.example.android.choosewisely;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page_6b extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6b);

        //get score value from previous page
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);

        //set text view in this page to include the score at the bottom
        TextView scoreText = (TextView) findViewById(R.id.score_text);
        scoreText.setText("Score: " + score);
    }

}
