package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_6a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6a);
    }

    public void open_Page_7a(View view){
        Intent i = new Intent(this, Page_7a.class);
        startActivity(i);
    }
    public void open_Page_7b(View view){
        Intent i = new Intent(this, Page_7b.class);
        startActivity(i);
    }
}
