package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

import static android.graphics.Color.rgb;

public class Page_5b extends AppCompatActivity {
    int score;
    Button b0, b1;
    Timer timer;
    TimerTask timerTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5b);

        //gets score value from previous page and sets it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
        b0 = (Button)findViewById(R.id.button_5b);
        b1 = (Button)findViewById(R.id.button_5c);
    }

    //on press of this button, increments score and proceeds to final page based on score value.
    public void open_Page_6b(View view){
        //change background color
        b0.setBackgroundColor(rgb(0,191,165));
        //create timer
        timer = new Timer();
        score += 1;
        if(score == 6) {
            Intent i = new Intent(this, Page_7a.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else if(score >= 4){
            Intent i = new Intent(this, Page_7b.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else if (score >= 2){
            Intent i = new Intent(this, Page_6b.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else{
            Intent i = new Intent(this, Page_6c.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
    }

    //on press of this button, proceeds to final page based on score value
    public void open_Page_6c(View view){
        score += 0;
        //change background color
        b1.setBackgroundColor(rgb(0,191,165));
        //create timer
        timer = new Timer();
        if(score == 6) {
            Intent i = new Intent(this, Page_7a.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else if(score >= 4){
            Intent i = new Intent(this, Page_7b.class);
            i.putExtra("int", score);
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else if (score >= 2){
            Intent i = new Intent(this, Page_6b.class);
            i.putExtra("int", score);
            //sets device to vibrate upon being called
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
        else{
            Intent i = new Intent(this, Page_6c.class);
            i.putExtra("int", score);
            //sets device to vibrate upon being called
            Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
            startService(intentVibrate);
            //create timer task
            initializeTimerTask(i);
            //delay by 500 ms and then implement task
            timer.schedule(timerTask,500);
        }
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
