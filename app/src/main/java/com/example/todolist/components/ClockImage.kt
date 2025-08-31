package com.example.todolist.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.todolist.R

@Composable
fun ClockImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.clock),
        contentDescription = null,
        modifier = modifier
    )
}
