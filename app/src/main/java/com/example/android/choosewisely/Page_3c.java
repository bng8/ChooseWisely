package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

import static android.graphics.Color.rgb;

public class Page_3c extends AppCompatActivity {
    int score;
    Button b0, b1;
    Timer timer;
    TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3c);

        //gets score value from previous page, sets it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
        b0 = (Button)findViewById(R.id.button_3a);
        b1 = (Button)findViewById(R.id.button_3b);
    }

    //on press of this button, increments score, passes score, and goes to next page
    public void open_Page_4a(View view){
        //change background color
        b0.setBackgroundColor(rgb(0,191,165));
        //create timer
        timer = new Timer();

        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
        //create intent
        score += 1;
        Intent i = new Intent(this, Page_4a.class);
        i.putExtra("int", score);
        //create timer task
        initializeTimerTask(i);
        //delay by 500 ms and then implement task
        timer.schedule(timerTask,500);
    }
    //on press of this button, increments score, passes score, and goes to next page
    public void open_Page_4b(View view){
        //change background color
        b1.setBackgroundColor(rgb(0,191,165));
        //create timer
        timer = new Timer();

        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
        //create intent
        score += 0;
        Intent i = new Intent(this, Page_4b.class);
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
