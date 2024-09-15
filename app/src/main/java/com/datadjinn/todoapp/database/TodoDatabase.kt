package com.datadjinn.todoapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.datadjinn.todoapp.data.model.Todo
import com.datadjinn.todoapp.data.dao.TodoDao

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