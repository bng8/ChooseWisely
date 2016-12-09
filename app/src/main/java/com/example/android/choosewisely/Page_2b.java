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
        Bundle extras = getIntent().getExtras();

        score = extras.getInt("int",0);
    }
    public void open_Page_3c(View view){
        score += 1;
        Intent i = new Intent(this, Page_3c.class);
        i.putExtra("int",score);
        startActivity(i);
    }
    public void open_Page_3d(View view){
        score += 0;
        Intent i = new Intent(this, Page_3d.class);
        i.putExtra("int",score);
        startActivity(i);
    }
}
