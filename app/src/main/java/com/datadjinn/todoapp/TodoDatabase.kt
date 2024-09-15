package com.datadjinn.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Todo::class],
    version = 1,
)

@TypeConverters(Converter::class)
abstract class TodoDatabase: RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "Todo_DB"
    }

    abstract fun getTodoDao(): TodoDao
}