package com.example.alertdialogdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.health.connect.datatypes.BodyTemperatureMeasurementLocation;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("關於本書")
                    .setMessage("Android程式設計與應用\n作者：陳歡\n教師：恰克虎")
                    .setCancelable(true)
                    .setPositiveButton("確定", null)
                    .show();
        });

        Button btnEnd = (Button) findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("確認")
                        .setMessage("確認結束本程式")
                        .setPositiveButton("確認",null)
                        .setNegativeButton("取消",null)
                        .show();
            }
        });

        Button btnColor = (Button) findViewById(R.id.btnColor);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("選擇一個顏色")
                        .setItems(new String[]{"紅色","黃色","綠色"}, MainActivity.this)
                        .setPositiveButton("取消", MainActivity.this)
                        .show();
            }

        });
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {
        Button btnColor = (Button) findViewById(R.id.btnColor);
        switch (which){
            case 0:
                btnColor.setBackgroundColor(Color.RED);
                break;
            case 1:
                btnColor.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                btnColor.setBackgroundColor(Color.GREEN);
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this,"按下取消鍵",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}