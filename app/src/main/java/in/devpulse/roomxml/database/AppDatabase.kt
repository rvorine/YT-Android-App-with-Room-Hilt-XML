package `in`.devpulse.roomxml.database

import androidx.room.Database
import androidx.room.RoomDatabase
import `in`.devpulse.roomxml.model.TodoDao
import `in`.devpulse.roomxml.model.TodoEntity

@Database(entities = [TodoEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun todoDao():TodoDao
}