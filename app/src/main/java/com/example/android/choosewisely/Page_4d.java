package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_4d extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4d);

        //gets score value from previous page and sets it to local score variable
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
    }

    //on press of this button, increments score, passed score to next page and goes to next page
    public void open_Page_5e(View view){
        score += 1;
        Intent i = new Intent(this, Page_5e.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }

    //on press of this button, passes score to next page and goes to next page
    public void open_Page_5f(View view){
        score += 0;
        Intent i = new Intent(this, Page_5f.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }
}
