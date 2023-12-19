package com.example.practice_fa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OptionHandler extends AppCompatActivity {

    Button page_one, page_two, page_home;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_option);

        // Page One Section Start
        page_one = (Button) findViewById(R.id.page_one);
        page_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page_one = new Intent(OptionHandler.this, SearchEngine.class);
                startActivity(page_one);
            }
        });
        // Page one Section End

        // Page Two Section Start
        page_two = (Button) findViewById(R.id.page_two);
        page_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page_two = new Intent(OptionHandler.this, ImageHandler.class);
                startActivity(page_two);
            }
        });
        // Page Two Section End

        // Page Home Button Start
        page_home = (Button) findViewById(R.id.home_button);
        page_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home_page = new Intent(OptionHandler.this, MainActivity.class);
                startActivity(home_page);
            }
        });
        // Page Home Button End
    }
}
