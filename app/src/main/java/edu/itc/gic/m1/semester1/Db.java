package edu.itc.gic.m1.semester1;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Contributor.class}, version = 1)
public abstract class Db extends RoomDatabase {

    public abstract contributorDao getcontributor();


    private static Db INSTANCE;
    public static Db getInstance(Context context) {
        Db db = Room.databaseBuilder(context.getApplicationContext(),
                Db.class, "github.db").build();
        return INSTANCE;
    }
    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
