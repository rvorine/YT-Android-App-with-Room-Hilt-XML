package `in`.devpulse.roomxml.repository

import `in`.devpulse.roomxml.database.AppDatabase
import `in`.devpulse.roomxml.model.TodoEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface TodoRepository {
    suspend fun insert(items: List<TodoEntity>)
    suspend fun updateItem(item: TodoEntity)
    suspend fun getAllTodo(): Flow<List<TodoEntity>>
    suspend fun deleteItem(item: TodoEntity)
}

class TodoRepositoryImpl @Inject constructor(
    private val db: AppDatabase
) : TodoRepository {
    override suspend fun insert(items: List<TodoEntity>) = db.todoDao().insert(items)

    override suspend fun updateItem(item: TodoEntity) = db.todoDao().updateTodo(item)

    override suspend fun getAllTodo(): Flow<List<TodoEntity>> = db.todoDao().getAllTodos()

    override suspend fun deleteItem(item: TodoEntity) = db.todoDao().deleteTodo(item)

}