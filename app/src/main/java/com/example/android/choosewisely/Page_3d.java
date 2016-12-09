package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_3d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3d);
    }

    public void open_Page_4c(View view){
        Intent i = new Intent(this, Page_4c.class);
        startActivity(i);
    }
    public void open_Page_4d(View view){
        Intent i = new Intent(this, Page_4d.class);
        startActivity(i);
    }
}
