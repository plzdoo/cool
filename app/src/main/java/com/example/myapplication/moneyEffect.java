package com.example.myapplication;

public class moneyEffect {
    private int money = 0;
    moneyEffect(int setMoney) {
        money = setMoney;
    }
    public void bankrupt() {
        if (money < 0) {
            money = 0;
        }

    }
}
