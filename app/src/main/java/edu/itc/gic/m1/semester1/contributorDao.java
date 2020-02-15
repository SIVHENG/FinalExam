package edu.itc.gic.m1.semester1;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface contributorDao {
    @Insert
    Void insert(List<Contributor> contributors);

    @Query("Select * from Contributor")
    List<Contributor> listAll();


}
