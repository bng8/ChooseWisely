package com.example.android.choosewisely;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.choosewisely.data.ScoreContract;
import com.example.android.choosewisely.data.ScoreDBHelper;

public class Page_6b extends AppCompatActivity {
    int score;

    private MediaPlayer play;
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

        //media playback of tada.mp3 stored in raw resource file
        play = MediaPlayer.create(this, R.raw.tada);
        play.start();

        //instantiate new database helper
        ScoreDBHelper mDbHelper = new ScoreDBHelper(this);

        //get a writable database
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        //set projections
        String[] projection = {
                ScoreContract.ScoreEntry._ID,
                ScoreContract.ScoreEntry.COLUMN_SCORE_VALUE};

        //instantiate a database query
        Cursor cursor = db.query(
                ScoreContract.ScoreEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null);

        //clear the database
        if(cursor.getCount() == 1) {
            db.delete(ScoreContract.ScoreEntry.TABLE_NAME, null, null);
        }
        //set the values
        ContentValues values = new ContentValues();
        values.put(ScoreContract.ScoreEntry.COLUMN_SCORE_VALUE, score);

        //insert the value into the database
        long newRowId = db.insert(ScoreContract.ScoreEntry.TABLE_NAME, null, values);
    }

}
