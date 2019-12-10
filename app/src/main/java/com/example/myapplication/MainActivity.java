package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startB = findViewById(R.id.startButton);
        //Button load = findViewById(R.id.loadGame);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.play_music);


        startB.setOnClickListener(unused -> {
            //System.out.println("xxx");
            try {
                mp.start();
                System.out.println("xxx");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(MainActivity.this, PickPerson.class);
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
        Timer T = new Timer();
        T.scheduleAtFixedRate(new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        TextView score = findViewById(R.id.textView4);
                        score.setText("Now you've enjoyed: " + count / 15 + " seconds being a real thug");
                        count++;
                    }
                });
            }
        }, 60, 60);
    }
    public void sendMessage1(View view) {

    }
}
