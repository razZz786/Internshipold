package com.example.hacker.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void divide (View view)
    {
        Intent intent=new Intent(this,com.example.hacker.myapplication.divide.class);
        startActivity(intent);
    }
}
