package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_5a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5a);
    }

    public void open_Page_6a(View view){
        Intent i = new Intent(this, Page_6a.class);
        startActivity(i);
    }
    public void open_Page_6b(View view){
        Intent i = new Intent(this, Page_6b.class);
        startActivity(i);
    }
}
