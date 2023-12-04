package com.example.mini_project;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Table Entity Moment
@Entity(tableName = "contacts_sufi")
public class MiniProject {

    // Column Moment
    @ColumnInfo(name = "contacts_id")
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "contacts_name")
    private String name;
    @ColumnInfo(name = "contacts_email")
    private String email;

    @ColumnInfo(name = "contacts_pwd")
    private String password;

    // Constructor Moment
    public MiniProject(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public MiniProject() {

    }

    public MiniProject(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter Moment
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
