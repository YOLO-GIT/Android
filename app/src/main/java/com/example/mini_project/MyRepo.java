package com.example.mini_project;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// TradeMark Sufi
public class MyRepo {
    // The Available Data Source - ROOM Database

    // Deal with The DAO in the Repo
    private final MiniProjectDAO contactDAO;
    ExecutorService executorService;
    Handler handler;

    // Constructor Moment
    public MyRepo(Application application) {

        MiniProjectDB miniProjectDB = MiniProjectDB.getInstance(application);
        this.contactDAO = miniProjectDB.getContactDao();
        // Used for Background Database Operations
        executorService = Executors.newSingleThreadExecutor();
        // Used for updating the UI
        handler = new Handler(Looper.getMainLooper());

    }

    // Methods in DAO is executing inside the Repo
    // CHECK THE DAO INTERFACE WOI
    // Insert Moment
    public void addContact(MiniProject contacts){
        // Executor Thread Moment (Belajar Sendiri)
        executorService = Executors.newSingleThreadExecutor();

        // Handler Moment (Used for updation and syncing the UI)
        handler = new Handler(Looper.getMainLooper());

        // Runnable: Execute Task Moment
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.insert(contacts);
            }
        });
    }

    // Delete Moment
    public void deleteContact(MiniProject contacts){
        executorService = Executors.newSingleThreadExecutor();

        handler = new Handler(Looper.getMainLooper());

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.delete(contacts);
            }
        });
    }

    // Query get the list (List)
    public LiveData<List<MiniProject>> getAllContacts(){
        return contactDAO.getAllContacts();
    }
}
