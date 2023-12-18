package com.example.practice_fa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OptionHandler extends AppCompatActivity {

    Button page_one, page_two;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_option);

        // Page One Section Start
        page_one = (Button) findViewById(R.id.page_one);
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
    }
}
