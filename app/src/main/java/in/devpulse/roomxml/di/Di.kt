package `in`.devpulse.roomxml.di

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import `in`.devpulse.roomxml.database.AppDatabase
import `in`.devpulse.roomxml.repository.TodoRepository
import `in`.devpulse.roomxml.repository.TodoRepositoryImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppDatabaseModule {
    @Singleton
    @Provides
    fun providesAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context = context,
            klass = AppDatabase::class.java,
            name = "todo_database.db"
        ).build()
    }
}

@InstallIn(SingletonComponent::class)
@Module
abstract class TodoRepositoryModule {
    @Binds
    abstract fun bindTodoRepository(todoImpl: TodoRepositoryImpl): TodoRepository
}