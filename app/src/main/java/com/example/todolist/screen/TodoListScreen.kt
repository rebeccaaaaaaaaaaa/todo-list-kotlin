package com.example.todolist.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todolist.components.Header
import com.example.todolist.ui.components.*
import com.example.todolist.viewmodel.TarefaViewModel

@Composable
fun TodoListScreen(viewModel: TarefaViewModel = viewModel()) {
    val tarefas = viewModel.tarefas

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Header()
        Spacer(Modifier.height(16.dp))
        ClockImage(modifier = Modifier.size(127.dp))
        Spacer(Modifier.height(16.dp))

        AddNewTask { titulo ->
            viewModel.adicionarTarefa(titulo)
        }

        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(tarefas) { tarefa ->
                TaskItem(
                    tarefa = tarefa,
                    onConcluir = { viewModel.concluirTarefa(tarefa.id) },
                    onRemover = { viewModel.removerTarefa(tarefa.id) }
                )
            }
        }
    }
}
