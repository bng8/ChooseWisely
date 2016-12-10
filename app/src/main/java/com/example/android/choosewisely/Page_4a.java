package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_4a extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4a);

        //gets score from previous page and sets it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);

    }

    //on press of this button, increments score, passes score and proceeds to next page
    public void open_Page_5a(View view){
        score += 1;
        Intent i = new Intent(this, Page_5a.class);
        i.putExtra("int",score);
        startActivity(i);
    }

    //on press of this button, increments score, passes score and proceeds to next page
    public void open_Page_5b(View view){
        score += 0;
        Intent i = new Intent(this, Page_5b.class);
        i.putExtra("int",score);
        startActivity(i);
    }
}
