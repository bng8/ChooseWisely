package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_2a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2a);
    }
    public void open_Page_3a(View view){
        Intent i = new Intent(this, Page_3a.class);
        startActivity(i);
    }
    public void open_Page_3b(View view){
        Intent i = new Intent(this, Page_3b.class);
        startActivity(i);
    }
}
