package com.example.android.choosewisely;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.choosewisely.data.ScoreContract;
import com.example.android.choosewisely.data.ScoreDBHelper;

import java.util.Timer;
import java.util.TimerTask;

import static android.graphics.Color.rgb;


public class MainActivity extends AppCompatActivity {
    //varibale keeps track of score between pages. Set here to zero at start
    int score = 0;
    int lastScore;
    Button b0;
    Timer timer;
    TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button)findViewById(R.id.button_0);
        TextView scoreText = (TextView) findViewById(R.id.score_text_previous);

        //instantiate a new database helper
        ScoreDBHelper mDbHelper= new ScoreDBHelper(this);

        //get a readable database
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

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

        //use cursor to get values from database
        try {
            while(cursor.moveToNext()) {
                int idColumnIndex = cursor.getColumnIndex(ScoreContract.ScoreEntry._ID);
                int scoreColumnIndex = cursor.getColumnIndex(ScoreContract.ScoreEntry.COLUMN_SCORE_VALUE);
                int currentScoreToDisplay = cursor.getInt(scoreColumnIndex);
                //take the value from the score column and use it to set the text in text view
                scoreText.setText("Previous Score: " + currentScoreToDisplay);
            }
        } finally {
            //close cursor to prevent memory leaks
            cursor.close();
        }
    }

    //on call of this method, change the backgound color of the button, passes score, and goes to next page
    public void open_Page_1(View view){
        //change background color
        b0.setBackgroundColor(rgb(0,191,165));
        //create timer
        timer = new Timer();

        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
        //create intent
        Intent i = new Intent(this, Page_1.class);
        i.putExtra("int", score);
        //create timer task
        initializeTimerTask(i);
        //delay by 500 ms and then implement task
        timer.schedule(timerTask,500);

    }

    //create timer task and set it start activity
    public void initializeTimerTask(final Intent i){
        timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(i);
            }
        };
    }
}
