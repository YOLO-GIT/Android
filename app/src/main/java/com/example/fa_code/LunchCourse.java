// NAME         : AHMAD SUFI DANIAL BIN ABDUL AZIZ
// CLASS        : DDT5B
// NO. METRIC   : 34DDT21F1048

package com.example.fa_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class LunchCourse extends AppCompatActivity {
    ImageButton back_btn;
    ListView basic_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_course);

        // BACK BUTTON
        back_btn = (ImageButton) findViewById(R.id.back_option);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_btn = new Intent(LunchCourse.this, ChooseCourse.class);
                startActivity(back_btn);
            }
        });

        // Basic ListView Start

        basic_text = (ListView) findViewById(R.id.mylistView);
        String list_text[] = {"Nasi Kukus and Kopi O - RM 7","Nasi Ayam and Teh Tarik - RM 7","Nasi Berlauk - RM 5", "Nasi Kuning Ayam Merah - RM 5", "Kuih Mix - RM 5"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                LunchCourse.this,
                android.R.layout.simple_list_item_1,
                list_text
        );

        basic_text.setAdapter(adapter);

        // Basic ListView End
    }
}