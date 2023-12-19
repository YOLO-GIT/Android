package com.example.practice_fa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button next_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Explicit Intent Start

        // CALL THE ID FIRST
        next_page = (Button) findViewById(R.id.button);

        // MAKE WHERE THE ACTION SHOULD GO
        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent next_page = new Intent(MainActivity.this, OptionHandler.class);
                startActivity(next_page);

                // TOAST
                Toast.makeText(MainActivity.this, "Hello, User :D", Toast.LENGTH_LONG).show();
            }
        });

        // Explicit Intent End

    }
}