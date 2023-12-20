package com.example.fa_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class DinnerCourse extends AppCompatActivity {

    ImageButton back_btn;
    ListView basic_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner_course);

        // BACK BUTTON
        back_btn = (ImageButton) findViewById(R.id.back_option);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_btn = new Intent(DinnerCourse.this, ChooseCourse.class);
                startActivity(back_btn);
            }
        });

        // Basic ListView Start

        basic_text = (ListView) findViewById(R.id.mylistView);
        String list_text[] = {"Chicken Chop - RM 9","Lamb Chop - RM 7","Carrot Juice - RM 5", "Nasi Bujang - RM 5", "Air Limau - RM 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                DinnerCourse.this,
                android.R.layout.simple_list_item_1,
                list_text
        );

        basic_text.setAdapter(adapter);

        // Basic ListView End
    }
}