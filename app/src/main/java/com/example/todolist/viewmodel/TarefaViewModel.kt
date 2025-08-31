package com.example.todolist.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.todolist.data.Tarefa

class TarefaViewModel : ViewModel() {
    private val _tarefas = mutableStateListOf<Tarefa>()
    val tarefas: List<Tarefa> get() = _tarefas

    private var idCounter = 1

    fun adicionarTarefa(titulo: String) {
        if (titulo.isNotBlank()) {
            _tarefas.add(Tarefa(idCounter++, titulo))
        }
    }

    fun concluirTarefa(id: Int) {
        _tarefas.find { it.id == id }?.concluida = true
    }

    fun removerTarefa(id: Int) {
        _tarefas.removeAll { it.id == id }
    }
}
