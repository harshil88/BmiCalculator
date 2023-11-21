package com.harshilpadsala.bmicalculator.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun HeightSliderComponent(onValueChange : (Int) -> Unit) {

    val heightValue = remember { mutableStateOf(120) }

    Column {
        Text(text = "Height")
        Text(text = heightValue.value.toString())
        Slider(
            value = heightValue.value.toFloat(),
            valueRange = 50f..250f,
            onValueChange = { value ->
            heightValue.value = value.toInt()
            onValueChange(heightValue.value)
        })
    }
}