package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_4c extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4c);

        //gets score value from previous page, sets it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
    }

    //on press of this button, increments score, passed score to next page and goes to next page
    public void open_Page_5a(View view){
        score += 1;
        Intent i = new Intent(this, Page_5a.class);
        i.putExtra("int",score);
        startActivity(i);
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }

    //on press of this button, passes score to next page and goes to next page
    public void open_Page_5b(View view){
        score += 0;
        Intent i = new Intent(this, Page_5b.class);
        i.putExtra("int",score);
        startActivity(i);
        Intent intentVibrate =new Intent(getApplicationContext(),VibrateService.class);
        startService(intentVibrate);
    }
}
