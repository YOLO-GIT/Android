package com.example.mini_project;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

//TradeMark Sufi
public class MyViewModel extends AndroidViewModel {

    private MyRepo myRepo;

    //LiveData
    private LiveData<List<MiniProject>> allContacts;
    public MyViewModel(@NonNull Application application) {
        super(application);
        this.myRepo = new MyRepo(application);
    }

    public LiveData<List<MiniProject>> getAllContacts(){
        allContacts = myRepo.getAllContacts();
        return allContacts;
    }


    public void addNewContact(MiniProject miniProject){
        myRepo.addContact(miniProject);
    }

    public void deleteContact(MiniProject miniProject){
        myRepo.deleteContact(miniProject);
    }


}
