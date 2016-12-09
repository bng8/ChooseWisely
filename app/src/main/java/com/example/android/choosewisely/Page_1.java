package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);
    }

    public void open_Page_2a(View view){
        Intent i = new Intent(this, Page_2a.class);
        startActivity(i);
    }
    public void open_Page_2b(View view){
        Intent i = new Intent(this, Page_2b.class);
        startActivity(i);
    }
}

