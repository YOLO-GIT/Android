package com.example.mini_project;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface MiniProjectDAO {

    @Insert
    void insert(MiniProject miniProject);
    @Delete
    void delete(MiniProject miniProject);
    @Query("SELECT * FROM contacts_sufi")
    LiveData<List<MiniProject>> getAllContacts();
}
