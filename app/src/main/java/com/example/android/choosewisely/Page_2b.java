package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_2b extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2b);

        //gets score from previous page, sets it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
    }

    //on press of this button, increments score, passes score, and goes to next page
    public void open_Page_3c(View view){
        score += 1;
        Intent i = new Intent(this, Page_3c.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }

    //on press of this button, passes score, and goes to next page
    public void open_Page_3d(View view){
        score += 0;
        Intent i = new Intent(this, Page_3d.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }
}
