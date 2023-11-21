package com.harshilpadsala.bmicalculator.compose.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun CounterComponent(text: String, initialValue: Int, onClick: (Int) -> Unit) {

    val counterValue = remember { mutableIntStateOf(initialValue) }

    Text(text = "")
    Text(text = counterValue.value.toString())
    Row {
        CounterButton(icon = Icons.Rounded.Add, contentDescription = "Increment Counter Button") {
            counterValue.value++
            onClick(counterValue.value)
        }
        CounterButton(icon = Icons.Rounded.Remove, contentDescription = "Decrement Counter Button") {
            counterValue.value--
            onClick(counterValue.value)
        }
    }
}

@Composable
fun CounterButton(icon: ImageVector, contentDescription: String, onClick: () -> Unit) {
    ElevatedButton(onClick = onClick) {
        Icon(icon, contentDescription = contentDescription)
    }
}