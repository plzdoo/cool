package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class PickPerson extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_pick);
        Button zuck = findViewById(R.id.zuck_button);
        Button geoffery = findViewById(R.id.geoffery_button);
        Button jeff = findViewById(R.id.jeff_button);
        Button jack = findViewById(R.id.jackma_button);
        zuck.setOnClickListener(unused -> {
            Intent intent = new Intent(PickPerson.this, ZuckMoney.class);
            startActivity(intent);
        });
        geoffery.setOnClickListener(unused -> {
            Intent intent = new Intent(PickPerson.this, geofferyMoney.class);
            startActivity(intent);
        });





    // Do something in response to button click
    }

}
