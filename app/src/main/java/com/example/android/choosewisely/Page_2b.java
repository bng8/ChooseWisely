package com.example.android.choosewisely;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page_2b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2b);
    }
    public void open_Page_3c(View view){
        Intent i = new Intent(this, Page_3c.class);
        startActivity(i);
    }
    public void open_Page_3d(View view){
        Intent i = new Intent(this, Page_3d.class);
        startActivity(i);
    }
}
