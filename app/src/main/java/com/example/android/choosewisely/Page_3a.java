package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_3a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3a);
    }
    public void open_Page_4a(View view){
        Intent i = new Intent(this, Page_4a.class);
        startActivity(i);
    }
    public void open_Page_4b(View view){
        Intent i = new Intent(this, Page_4b.class);
        startActivity(i);
    }
}
