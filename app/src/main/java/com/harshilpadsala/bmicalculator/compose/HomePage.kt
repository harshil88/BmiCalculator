package com.harshilpadsala.bmicalculator.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.harshilpadsala.bmicalculator.R

enum class Gender{
    Male,
    Female
}

@Composable
fun HomePage(){
    Column {
        SelectGenderComponent()
    }
}

@Composable
fun SelectGenderComponent(){
    Row {
        GenderCard(
            text = "Male",
            imageRes = R.drawable.ic_male,
            imageDes = "Male Gender Image",
            onTap = {}
        )
        GenderCard(
            text = "Female",
            imageRes = R.drawable.ic_female,
            imageDes = "Female Gender Image",
            onTap = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenderCard(text : String , imageRes : Int , imageDes : String, onTap :  () -> Unit){
    Card(
        onClick = onTap
    ) {
        Image(
            painter = painterResource(
                id = imageRes,
                ),
            contentDescription = imageDes ,
            )
        Text(text = text)
    }
}

@Composable
fun GenderCardContent(){

}
