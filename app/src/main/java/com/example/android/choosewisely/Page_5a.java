package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_5a extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5a);

        //get score value from previous page and sets it to local score variable
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
    }

    //on press of this button, increments score, passes score value to next page and goes to page
    public void open_Page_6a(View view){
        score += 1;
        Intent i = new Intent(this, Page_6a.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }

    //on press of this button, passes score value and goes to next page
    public void open_Page_6b(View view){
        score += 0;
        Intent i = new Intent(this, Page_6b.class);
        i.putExtra("int",score);
        startActivity(i);
        //sets device to vibrate upon being called
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }
}
