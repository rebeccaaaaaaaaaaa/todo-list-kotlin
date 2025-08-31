package com.example.todolist.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddNewTask(
    modifier: Modifier = Modifier,
    addNewItem: (String) -> Unit = {}
) {
    var newItemText by remember { mutableStateOf("") }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp)
    ) {
        TextField(
            value = newItemText,
            onValueChange = { newItemText = it },
            placeholder = { Text("Add new task") },
            modifier = Modifier.weight(1f),
            singleLine = true
        )
        IconButton(onClick = {
            if (newItemText.isNotBlank()) {
                addNewItem(newItemText)
                newItemText = ""
            }
        }) {
            Icon(Icons.Default.Add, contentDescription = "Add task")
        }
    }
}
