package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class jackMoney extends AppCompatActivity {
    private int jackMoney = 4157 * (10^7);
    private int lam1 = 200000;
    private int richi1 = 120000000;
    private int manor1 = 100000000;
    private int diamond1 = 50000;
    private int blizzard1 = 2 * (10^10);
    private int mona1 = 7 * (10^8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_jack);
        TextView mp = findViewById(R.id.moneyBox);
        if (mp != null) {
            mp.setText(jackMoney);
        }
        ImageButton lam = findViewById(R.id.lam);
        ImageButton richi = findViewById(R.id.imageButton5);
        ImageButton manor = findViewById(R.id.imageButton6);
        ImageButton diamond = findViewById(R.id.imageButton9);
        ImageButton blizzard = findViewById(R.id.imageButton7);
        ImageButton mona = findViewById(R.id.imageButton8);
        if (jackMoney < 0) {
            lam.setClickable(false);
            richi.setClickable(false);
            manor.setClickable(false);
            diamond.setClickable(false);
            blizzard.setClickable(false);
            mona.setClickable(false);
        }
        if (lam != null && richi != null && manor != null && diamond != null
                && blizzard != null && mona != null) {

            lam.setOnClickListener(unused -> {
                jackMoney -= lam1;
            });

            richi.setOnClickListener(unused -> {
                jackMoney -= richi1;
            });
            manor.setOnClickListener(unused -> {
                jackMoney -= manor1;
            });
            diamond.setOnClickListener(unused -> {
                jackMoney -= diamond1;
            });
            blizzard.setOnClickListener(unused -> {
                jackMoney -= blizzard1;
            });
            mona.setOnClickListener(unused -> {
                jackMoney -= mona1;
            });
        }




    }

}
