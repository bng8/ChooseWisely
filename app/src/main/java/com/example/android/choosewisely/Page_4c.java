package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_4c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4c);
    }

    public void open_Page_5a(View view){
        Intent i = new Intent(this, Page_5a.class);
        startActivity(i);
    }
    public void open_Page_5b(View view){
        Intent i = new Intent(this, Page_5b.class);
        startActivity(i);
    }
}
