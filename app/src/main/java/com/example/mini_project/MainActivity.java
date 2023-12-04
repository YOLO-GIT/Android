package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mini_project.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    // Data Source
    private MiniProjectDB miniProjectDB;
    private ArrayList<MiniProject>  contactsArrayList = new ArrayList<>();

    // Adapter
    private MyAdapter myAdapter;

    // Binding
    private ActivityMainBinding mainBinding;
    private MainActivityClickHandler handlers;

    // View model
    MyViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data Binding
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        handlers = new MainActivityClickHandler(this);

        mainBinding.setClickHandler(handlers);

        // RecyclerView
        RecyclerView recyclerView = mainBinding.recyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Database:
        miniProjectDB = MiniProjectDB.getInstance(this);

        // View Model:
        viewModel = new ViewModelProvider(this)
                .get(MyViewModel.class);


        // Loading the Data from ROOM DB
        viewModel.getAllContacts().observe(this,
                new Observer<List<MiniProject>>() {
                    @Override
                    public void onChanged(List<MiniProject> contacts) {

                        contactsArrayList.clear();

                        for (MiniProject c: contacts){
                            contactsArrayList.add(c);
                        }

                        myAdapter.notifyDataSetChanged();

                    }
                });
        // Adapter
        myAdapter = new MyAdapter(contactsArrayList);

        // Linking the RecyclerView with the Adapter
        recyclerView.setAdapter(myAdapter);

        // swipe to delete
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                // If you swipe the item to the left
                MiniProject c = contactsArrayList.get(viewHolder.getAdapterPosition());

                viewModel.deleteContact(c);
            }
        }).attachToRecyclerView(recyclerView);
    }
}