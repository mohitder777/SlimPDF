package com.jicsoftwarestudio.slimpdfapp.db;

import androidx.room.RoomDatabase;

import com.jicsoftwarestudio.slimpdfapp.dao.ConfigDao;

public abstract class AppDatabase extends RoomDatabase {
    public abstract ConfigDao configDao();
}
