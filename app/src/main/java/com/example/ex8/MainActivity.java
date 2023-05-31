package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Switch switch2;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    LinearLayout l_layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        switch2 = findViewById(R.id.switch2);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        l_layout1 = findViewById(R.id.LinearLayout);
    }

    public void go(View view) {
        //checking for wich button selected and change the backround color
        if(switch2.isChecked() && radioButton1.isChecked())
        {
            l_layout1.setBackgroundColor(Color.RED);
        }
        else if(switch2.isChecked() && radioButton2.isChecked())
        {
            l_layout1.setBackgroundColor(Color.BLUE);
        }
        else if(switch2.isChecked() && radioButton3.isChecked())
        {
            l_layout1.setBackgroundColor(Color.GREEN);
        }
        else if(switch2.isChecked() && radioButton4.isChecked())
        {
            l_layout1.setBackgroundColor(Color.BLACK);
        }
    }
}