package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_3a extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3a);

        Bundle extras = getIntent().getExtras();

        score = extras.getInt("int",0);
    }
    public void open_Page_4a(View view){
        score += 1;
        Intent i = new Intent(this, Page_4a.class);
        i.putExtra("int",score);
        startActivity(i);
    }
    public void open_Page_4b(View view){
        score += 0;
        Intent i = new Intent(this, Page_4b.class);
        i.putExtra("int",score);
        startActivity(i);
    }
}
