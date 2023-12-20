// NAME         : AHMAD SUFI DANIAL BIN ABDUL AZIZ
// CLASS        : DDT5B
// NO. METRIC   : 34DDT21F1048

package com.example.fa_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button next_page, contact_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_page = (Button) findViewById(R.id.btn_nextpage);
        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome Back :D", Toast.LENGTH_LONG).show();
                Intent next_page = new Intent(MainActivity.this, ChooseCourse.class);
                startActivity(next_page);
            }
        });

        contact_page = (Button) findViewById(R.id.contact_page);
        contact_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact_page = new Intent(MainActivity.this, ContactPage.class);
                startActivity(contact_page);
            }
        });
    }
}