package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class PickPerson extends AppCompatActivity {
    Button zuck = findViewById(R.id.custom_button);
    public void sendMessage(View view) {
        Intent intent = new Intent(view.getContext(), ZuckMoney.class);
        startActivityForResult(intent, 0);

        // Do something in response to button click
    }

}
