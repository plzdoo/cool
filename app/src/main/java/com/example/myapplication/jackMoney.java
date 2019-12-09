package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class jackMoney extends AppCompatActivity {
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
        setContentView(R.layout.money_jack);
        TextView mp = findViewById(R.id.moneyBox);
        ImageButton lam = findViewById(R.id.lam);
        ImageButton richi = findViewById(R.id.imageButton5);
        ImageButton manor = findViewById(R.id.imageButton6);
        ImageButton diamond = findViewById(R.id.imageButton9);
        ImageButton blizzard = findViewById(R.id.imageButton7);
        ImageButton mona = findViewById(R.id.imageButton8);
<<<<<<< HEAD
        if (jackMoney < 0) {
            lam.setClickable(false);
            richi.setClickable(false);
            manor.setClickable(false);
            diamond.setClickable(false);
            blizzard.setClickable(false);
            mona.setClickable(false);
        }

=======
>>>>>>> a3a48a683553924fd302e73b2b30f8040ebcd365
        if (lam != null && richi != null && manor != null && diamond != null
                && blizzard != null && mona != null) {

            lam.setOnClickListener(unused -> {
                if (jackMoney - lam1 < 0) {
                    lam.setClickable(false);
                    mp.setText("I've gone bankrupt!");
                }
                jackMoney -= lam1;
<<<<<<< HEAD

=======
                mp.setText(String.valueOf(jackMoney));
>>>>>>> a3a48a683553924fd302e73b2b30f8040ebcd365
            });

            richi.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    richi.setClickable(false);
                }
                jackMoney -= richi1;
                mp.setText(String.valueOf(jackMoney));
            });
            manor.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    manor.setClickable(false);
                }
                jackMoney -= manor1;
                mp.setText(String.valueOf(jackMoney));
            });
            diamond.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    diamond.setClickable(false);
                }
                jackMoney -= diamond1;
                mp.setText(String.valueOf(jackMoney));
            });
            blizzard.setOnClickListener(unused -> {
                if (jackMoney - blizzard1 < 0) {
                    blizzard.setClickable(false);
                }
                jackMoney -= blizzard1;
                mp.setText(String.valueOf(jackMoney));
            });
            mona.setOnClickListener(unused -> {
                if (jackMoney < 0) {
                    mona.setClickable(false);
                }
                jackMoney -= mona1;
                mp.setText(String.valueOf(jackMoney));
            });
        }




    }
    public boolean bankup() {
        if (jackMoney - lam1 < 0) {
            return false;
        } else if (jackMoney
        return true;
    }

}
