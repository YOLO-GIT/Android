package com.example.mini_project;

//Annotate the DB with the Contact Class (Entity)
//Make it abstract to prevent clone
//Extends RoomDatabase to make the Contact Database
//Sufi TradeMark

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {MiniProject.class},version = 2)
public abstract class MiniProjectDB extends RoomDatabase {

    public abstract MiniProjectDAO getContactDao();

    //Singleton Pattern
    private static MiniProjectDB dbinstance;

    //Synchronization
    // Efficient, Safety, and Fast but if you use ROOM type DB
    public static  synchronized MiniProjectDB getInstance(Context context){

        // Loose but lite Database (Sometimes Leak)
        if (dbinstance == null){
            dbinstance = Room.databaseBuilder
                            (context.getApplicationContext(),
                                    MiniProjectDB.class, "contacts_db")
                    .fallbackToDestructiveMigration().build();
        }
        return dbinstance;
    }
}
