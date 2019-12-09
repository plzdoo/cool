package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startB = findViewById(R.id.startButton);
        Button load = findViewById(R.id.loadGame);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.play_music);
        startB.setOnClickListener(unused -> {
            Intent intent = new Intent(MainActivity.this, PickPerson.class);
            startActivity(intent);
            mp.start();
        });
        load.setOnClickListener(unused -> {
            Intent intent = new Intent(MainActivity.this, loadGame.class);
            startActivity(intent);
        });
        Button exit = findViewById(R.id.quitGame);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
    public void sendMessage1(View view) {

    }
}
