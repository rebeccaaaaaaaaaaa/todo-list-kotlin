package com.example.todolist.data

data class Tarefa(
    val id: Int,
    val titulo: String,
    var concluida: Boolean = false
)
