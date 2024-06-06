package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mainCourseGroup, drinkGroup, sideDishGroup;
    private Button confirmButton;
    private TextView orderResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainCourseGroup = findViewById(R.id.main_course_group);
        drinkGroup = findViewById(R.id.drink_group);
        sideDishGroup = findViewById(R.id.side_dish_group);
        confirmButton = findViewById(R.id.confirm_button);
        orderResult = findViewById(R.id.order_result);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mainCourseId = mainCourseGroup.getCheckedRadioButtonId();
                int drinkId = drinkGroup.getCheckedRadioButtonId();
                int sideDishId = sideDishGroup.getCheckedRadioButtonId();

                if (mainCourseId != -1 && drinkId != -1 && sideDishId != -1) {
                    RadioButton mainCourse = findViewById(mainCourseId);
                    RadioButton drink = findViewById(drinkId);
                    RadioButton sideDish = findViewById(sideDishId);

                    String order = "您的訂單:\n" +
                            "主餐: " + mainCourse.getText() + "\n" +
                            "飲料: " + drink.getText() + "\n" +
                            "附餐: " + sideDish.getText();
                    orderResult.setText(order);
                } else {
                    orderResult.setText("請選擇所有選項！");
                }
            }
        });
    }
}