package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button startB = (Button) findViewById(R.id.startButton);

    public void sendMessage(View view) {
        Intent intent = new Intent(view.getContext(), PickPerson.class);
        startActivityForResult(intent, 0);
        // Do something in response to button click
    }
    Button load = findViewById(R.id.loadGame);
    public void sendMessage1(View view) {

    }
}
