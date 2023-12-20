// NAME         : AHMAD SUFI DANIAL BIN ABDUL AZIZ
// CLASS        : DDT5B
// NO. METRIC   : 34DDT21F1048

package com.example.fa_code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactPage extends AppCompatActivity {

    Button home_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        home_btn = (Button) findViewById(R.id.button);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_home = new Intent(ContactPage.this, MainActivity.class);
                startActivity(back_home);
            }
        });
    }
}