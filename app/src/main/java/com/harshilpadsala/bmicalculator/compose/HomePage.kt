package com.harshilpadsala.bmicalculator.compose

import com.harshilpadsala.bmicalculator.compose.components.SelectGenderComponent
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.harshilpadsala.bmicalculator.compose.components.HeightSliderComponent

enum class Gender {
    None, Male, Female
}

@Composable
fun HomePage() {
    Column {
        SelectGenderComponent(modifier = Modifier) { gender ->
            Log.i("Gender", "Selected Gender is $gender")
        }
        HeightSliderComponent { height ->
            Log.i("Gender", "Selected Height is $height")
        }
    }
}


