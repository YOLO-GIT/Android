// NAME         : AHMAD SUFI DANIAL BIN ABDUL AZIZ
// CLASS        : DDT5B
// NO. METRIC   : 34DDT21F1048

package com.example.fa_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseCourse extends AppCompatActivity {

    ImageButton home_btn;
    Button btn_one, btn_two, btn_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);

        // BUTTON ONE
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseCourse.this, "Breakfast Time", Toast.LENGTH_SHORT).show();
                Intent b_fast = new Intent(ChooseCourse.this, BreakfastCourse.class);
                startActivity(b_fast);
            }
        });

        // BUTTON TWO
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseCourse.this, "Lunch Time", Toast.LENGTH_SHORT).show();
                Intent lunch = new Intent(ChooseCourse.this, LunchCourse.class);
                startActivity(lunch);
            }
        });

        // BUTTON THREE
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChooseCourse.this, "Dinner Time", Toast.LENGTH_SHORT).show();
                Intent dinner = new Intent(ChooseCourse.this, DinnerCourse.class);
                startActivity(dinner);
            }
        });

        // HOME BUTTON
        home_btn = (ImageButton) findViewById(R.id.home_button);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ChooseCourse.this, MainActivity.class);
                startActivity(home);
            }
        });
    }
}