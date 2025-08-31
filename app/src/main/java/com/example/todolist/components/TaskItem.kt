package com.example.todolist.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.data.Tarefa

@Composable
fun TaskItem(
    tarefa: Tarefa,
    onConcluir: () -> Unit,
    onRemover: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Checkbox(
            checked = tarefa.concluida,
            onCheckedChange = { onConcluir() }
        )
        Text(
            text = tarefa.titulo,
            fontSize = 14.sp,
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = { onRemover() }) {
            Icon(Icons.Default.Delete, contentDescription = "Remove Task")
        }
    }
}
