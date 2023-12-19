package com.example.practice_fa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchEngine extends AppCompatActivity {

    Button search_btn, back_option;
    EditText search_url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_image);

        // IMPLICIT START

        // URL Search
        search_url = (EditText) findViewById(R.id.search_me);
        // Search Button
        search_btn = (Button) findViewById(R.id.button);
        back_option = (Button) findViewById(R.id.button_two);

        // Action Start

        back_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_option = new Intent(SearchEngine.this, OptionHandler.class);
                startActivity(back_option);
            }
        });
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = search_url.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + url));
                startActivity(intent);
            }
        });

        // IMPLICIT END
    }
}
