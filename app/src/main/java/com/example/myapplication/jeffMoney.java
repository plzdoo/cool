package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class jeffMoney extends AppCompatActivity {
    private long jackMoney = 415700000;
    private int lam1 = 2000;
    private int richi1 = 1200000;
    private int manor1 = 1000000;
    private int diamond1 = 500;
    private int blizzard1 = 200000000;
    private int mona1 = 7000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeff_money);
        TextView mp = findViewById(R.id.moneyBox);
        ImageButton lam = findViewById(R.id.lam);
        ImageButton richi = findViewById(R.id.imageButton5);
        ImageButton manor = findViewById(R.id.imageButton6);
        ImageButton diamond = findViewById(R.id.imageButton9);
        ImageButton blizzard = findViewById(R.id.imageButton7);
        ImageButton mona = findViewById(R.id.imageButton8);
        if (jackMoney < 0) {
            blizzard.setClickable(false);
            lam.setClickable(false);
            mona.setClickable(false);
            mp.setText("I've gone bankrupt!");
        } else {
            mp.setText(String.valueOf(jackMoney));
        }

        if (lam != null && richi != null && manor != null && diamond != null
                && blizzard != null && mona != null) {

            lam.setOnClickListener(unused -> {
                if (jackMoney - lam1 < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - lam1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= lam1;
            });

            richi.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    richi.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - richi1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= richi1;
            });
            manor.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    manor.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - manor1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= manor1;
            });
            diamond.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    diamond.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - diamond1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= diamond1;
            });
            blizzard.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    blizzard.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - blizzard1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= blizzard1;

            });
            mona.setOnClickListener(unused -> {
                if (jackMoney - mona1 < 0) {
                    mona.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                if (jackMoney - mona1 > 0) {
                    mp.setText(String.valueOf(jackMoney));
                }
                jackMoney -= mona1;
            });
        }




    }


}
