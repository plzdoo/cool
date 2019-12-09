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
<<<<<<< HEAD
        Button load = findViewById(R.id.loadGame);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.play_music);
=======
>>>>>>> a3a48a683553924fd302e73b2b30f8040ebcd365
        startB.setOnClickListener(unused -> {
            Intent intent = new Intent(MainActivity.this, PickPerson.class);
            startActivity(intent);
            mp.start();
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
