package com.example.appmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mysongActivity extends AppCompatActivity {

TextView ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysong);
        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        ten=(TextView)findViewById(R.id.txt_ten);
        ten.setText(name);
    }
}
