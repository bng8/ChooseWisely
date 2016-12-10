package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_5d extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5d);

        //get score value from previous page, set it to local score value
        Bundle extras = getIntent().getExtras();
        score = extras.getInt("int",0);
    }

    //on press of this button, will increment score and proceed to final page based on score
    public void open_Page_6b(View view){
        score += 1;
        if(score == 6) {
            Intent i = new Intent(this, Page_7a.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else if(score >= 4){
            Intent i = new Intent(this, Page_7b.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else if (score >= 2){
            Intent i = new Intent(this, Page_6b.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else{
            Intent i = new Intent(this, Page_6c.class);
            i.putExtra("int", score);
            startActivity(i);
        }
    }

    //on press of this button, will proceed to final page based on score
    public void open_Page_6c(View view){
        score += 0;
        if(score == 6) {
            Intent i = new Intent(this, Page_7a.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else if(score >= 4){
            Intent i = new Intent(this, Page_7b.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else if (score >= 2){
            Intent i = new Intent(this, Page_6b.class);
            i.putExtra("int", score);
            startActivity(i);
        }
        else{
            Intent i = new Intent(this, Page_6c.class);
            i.putExtra("int", score);
            startActivity(i);
        }
    }
}
