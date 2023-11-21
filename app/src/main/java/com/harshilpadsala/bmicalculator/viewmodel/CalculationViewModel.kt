package com.harshilpadsala.bmicalculator.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.harshilpadsala.bmicalculator.compose.Gender

class CalculationViewModel : ViewModel() {

    var gender : Gender = Gender.None
    var height : Int = 180
    var weight : Int = 68
    var age : Int = 24


    fun calculateBMI(): Double {

        val bmi = (weight.toFloat() / (height.toFloat() * height.toFloat())) * 10000F

        val genderAdjustment = when(gender) {
            Gender.Female -> -0.5
            Gender.Male  -> 0.5
            else -> 0.0
        }
        Log.i("Gender" , " BMI $bmi")
        Log.i("Gender" , " Gender Adjustment $genderAdjustment")
        Log.i("Gender" , "Calculated BMI ${bmi + genderAdjustment}")

        return bmi + genderAdjustment
    }


}