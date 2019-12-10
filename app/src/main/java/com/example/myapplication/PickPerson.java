package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//import com.bumptech.glide.Glide;


public class PickPerson extends AppCompatActivity {
    private ImageView thuglife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_pick);
        Button zuck = findViewById(R.id.zuck_button);
        Button geoffery = findViewById(R.id.geoffery_button);
        Button jeff = findViewById(R.id.jeff_button);
        Button jack = findViewById(R.id.jackma_button);
        //thuglife = findViewById(R.id.thuglife);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.money_music);
        zuck.setOnClickListener(unused -> {
            //Glide.with(this).load(R.drawable.thuglife).into(thuglife);
            try {
                mp.start();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(PickPerson.this, ZuckMoney.class);
            startActivity(intent);
        });
        geoffery.setOnClickListener(unused -> {
            try {
                mp.start();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(PickPerson.this, geofferyMoney.class);
            startActivity(intent);
        });
        jeff.setOnClickListener(unused -> {
            try {
                mp.start();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(PickPerson.this, jeffMoney.class);
            startActivity(intent);
        });
        jack.setOnClickListener(unused -> {
            try {
                mp.start();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(PickPerson.this, jackMoney.class);
            startActivity(intent);
        });





    // Do something in response to button click
    }

}
