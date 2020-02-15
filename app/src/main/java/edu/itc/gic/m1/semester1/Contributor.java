package edu.itc.gic.m1.semester1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "contributor")
public class Contributor {
    @PrimaryKey(autoGenerate = true)
    long id;

    @ColumnInfo(name = "login")
    String login;
    @ColumnInfo(name = "avatar_Url")
    String avatar_Url;
    public Contributor(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_Url() {
        return avatar_Url;
    }

    public void setAvatar_Url(String avatar_Url) {
        this.avatar_Url = avatar_Url;
    }
}


