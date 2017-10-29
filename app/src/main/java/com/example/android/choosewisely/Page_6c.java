package com.example.android.choosewisely;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.choosewisely.data.ScoreContract;
import com.example.android.choosewisely.data.ScoreDBHelper;

public class Page_6c extends AppCompatActivity {
    int score;

    private MediaPlayer play;
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

        //media playback of awwww.mp3 stored in raw resource file
        play = MediaPlayer.create(this, R.raw.awww);
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

        //set the value
        ContentValues values = new ContentValues();
        values.put(ScoreContract.ScoreEntry.COLUMN_SCORE_VALUE, score);

        //insert the value into the database
        long newRowId = db.insert(ScoreContract.ScoreEntry.TABLE_NAME, null, values);
    }
}

