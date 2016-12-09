package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_4d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4d);
    }
    public void open_Page_5e(View view){
        Intent i = new Intent(this, Page_5e.class);
        startActivity(i);
    }
    public void open_Page_5f(View view){
        Intent i = new Intent(this, Page_5f.class);
        startActivity(i);
    }
}
