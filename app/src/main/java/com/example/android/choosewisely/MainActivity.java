package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //varibale keeps track of score between pages. Set here to zero at start
    int score = 0;
    int lastScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on press of this button, passes score, and goes to next page
    public void open_Page_1(View view){
        Intent i = new Intent(this, Page_1.class);
        i.putExtra("int", score);
        startActivity(i);
    }
}
