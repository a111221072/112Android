package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk1, chk2, chk3, chk4;
    private ImageView output1, output2, output3, output4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);

        output1 = findViewById(R.id.output1);
        output2 = findViewById(R.id.output2);
        output3 = findViewById(R.id.output3);
        output4 = findViewById(R.id.output4);

        chk1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                output1.setVisibility(View.VISIBLE);
            } else {
                output1.setVisibility(View.GONE);
            }
        });

        chk2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                output2.setVisibility(View.VISIBLE);
            } else {
                output2.setVisibility(View.GONE);
            }
        });

        chk3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                output3.setVisibility(View.VISIBLE);
            } else {
                output3.setVisibility(View.GONE);
            }
        });

        chk4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                output4.setVisibility(View.VISIBLE);
            } else {
                output4.setVisibility(View.GONE);
            }
        });
    }
}

