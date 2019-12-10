package com.example.myapplication;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class geofferyMoney extends AppCompatActivity {
    private int geofferyMoney = 1250;
    private int bus = 1;
    private int dogfood = 20;
    private int ticket = 100;
    private int foellinger = 100;
    private int iken = 15;
    private int workout = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_geoffery);
        TextView mp = findViewById(R.id.moneyBox);
        ImageButton lam = findViewById(R.id.bus);
        ImageButton richi = findViewById(R.id.imageButton5);
        ImageButton manor = findViewById(R.id.imageButton6);
        ImageButton diamond = findViewById(R.id.imageButton9);
        ImageButton blizzard = findViewById(R.id.imageButton7);
        ImageButton mona = findViewById(R.id.imageButton8);
        if (lam != null && richi != null && manor != null && diamond != null
                && blizzard != null && mona != null) {

            lam.setOnClickListener(unused -> {
                if (geofferyMoney - bus < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - bus > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= bus;
            });

            richi.setOnClickListener(unused -> {
                if (geofferyMoney - dogfood < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - dogfood > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= dogfood;
            });
            manor.setOnClickListener(unused -> {
                if (geofferyMoney - ticket < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - ticket > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= ticket;
            });
            diamond.setOnClickListener(unused -> {
                if (geofferyMoney - foellinger < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - foellinger > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= foellinger;
            });
            blizzard.setOnClickListener(unused -> {
                if (geofferyMoney - iken < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - iken > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= iken;
            });
            mona.setOnClickListener(unused -> {
                if (geofferyMoney - workout < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (geofferyMoney - workout > 0) {
                    mp.setText(String.valueOf(geofferyMoney));
                }
                geofferyMoney -= workout;
            });
        }




    }

}
