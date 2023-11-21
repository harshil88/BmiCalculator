package com.harshilpadsala.bmicalculator.compose

import com.harshilpadsala.bmicalculator.compose.components.SelectGenderComponent
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.harshilpadsala.bmicalculator.compose.components.CounterComponent
import com.harshilpadsala.bmicalculator.compose.components.HeightSliderComponent
import com.harshilpadsala.bmicalculator.viewmodel.CalculationViewModel

enum class Gender {
    None, Male, Female
}

@Composable
fun HomePage(
    calculationViewModel : CalculationViewModel = viewModel()
) {
    Column {
        SelectGenderComponent(modifier = Modifier) { gender ->
            calculationViewModel.gender = gender
            Log.i("Gender", "Selected Gender is $gender")
        }
        HeightSliderComponent(initialValue = calculationViewModel.height) { height ->
            Log.i("Gender", "Selected Height is $height")
        }
        CounterComponent(text = "Age", initialValue = calculationViewModel.age, onClick = {age ->Log.i("Gender", "Selected age is $age") })
        CounterComponent(text = "Weight", initialValue = calculationViewModel.weight, onClick = {weight ->Log.i("Gender", "Selected weight is $weight") })
        ElevatedButton(onClick = { calculationViewModel.calculateBMI()}) {
        }
    }
}


