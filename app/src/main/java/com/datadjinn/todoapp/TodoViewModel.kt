package com.datadjinn.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {
    private var _todos = MutableLiveData<List<Todo>>()
    val todoList: LiveData<List<Todo>> = _todos

    private fun getAllTodo() {
        _todos.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title: String) {
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id: Int) {
        TodoManager.deleteTodo(id)
        getAllTodo()
    }
}