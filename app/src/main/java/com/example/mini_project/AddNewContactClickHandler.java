package com.example.mini_project;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

public class AddNewContactClickHandler  {

    MiniProject miniProject;
    Context context;
    MyViewModel myViewModel;

    public AddNewContactClickHandler(MiniProject miniProject,
                                     Context context,
                                     MyViewModel myViewModel) {
        this.miniProject = miniProject;
        this.context = context;
        this.myViewModel = myViewModel;

    }

    public void onSubmitBtnClicked(View view){
        if (miniProject.getName() == null || miniProject.getEmail() == null || miniProject.getPassword() == null){
            Toast.makeText(context, "Fields Cannot be empty", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(context,MainActivity.class);

            MiniProject c = new MiniProject(
                    miniProject.getName(),
                    miniProject.getEmail(),
                    miniProject.getPassword()
            );

            myViewModel.addNewContact(c);

            context.startActivity(i);

        }
    }
}
