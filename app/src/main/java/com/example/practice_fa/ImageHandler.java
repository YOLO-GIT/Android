package com.example.practice_fa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImageHandler extends AppCompatActivity {

    ListView basic_text, custom_list;

    Button back_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_handler);

        // Basic ListView Start

        basic_text = (ListView) findViewById(R.id.mylistView);
        String list_text[] = {"Elephant","Snail","Flamingo"};

        //3. Adapter acts as a bridge between the 'Data Source' and the adapter view
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                ImageHandler.this,
                android.R.layout.simple_list_item_1,
                list_text
        );

        basic_text.setAdapter(adapter);

        // Basic ListView End

//        // Custom ListView Start
//        String countryList[] = {"Elephant","Snail","Flamingo"};
//        int flags[] = {R.drawable.elephant, R.drawable.snail, R.drawable.flamingo};
//
//        custom_list = (ListView) findViewById(R.id.mylistView);
//        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
//
//        custom_list.setAdapter(customAdapter);
//        // Custom ListView End

        back_button = (Button) findViewById(R.id.back_option);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_option = new Intent(ImageHandler.this, OptionHandler.class);
                startActivity(back_option);
            }
        });
    }


}
