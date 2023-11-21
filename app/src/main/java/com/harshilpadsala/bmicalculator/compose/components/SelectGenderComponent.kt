package com.harshilpadsala.bmicalculator.compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.harshilpadsala.bmicalculator.R
import com.harshilpadsala.bmicalculator.compose.Gender

@Composable
fun SelectGenderComponent(
    modifier: Modifier, onSelectGender: (Gender) -> Unit
) {
    val selectedGender = remember { mutableStateOf(Gender.None) }

    Row(
        modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        MaleGenderCard(modifier = Modifier.border(
            2.dp, if (selectedGender.value == Gender.Male) Color.Blue else Color.Red
        )) {
            selectedGender.value = Gender.Male
            onSelectGender(selectedGender.value)
        }

        FemaleGenderCard(modifier = Modifier.border(
            2.dp, if (selectedGender.value == Gender.Female) Color.Blue else Color.Red
        )) {
            selectedGender.value = Gender.Female
            onSelectGender(selectedGender.value)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaleGenderCard(modifier: Modifier, onClick: () -> Unit) {
    Card(
        onClick = onClick, modifier = modifier
    ) {
        GenderCardContent(
            text = "Male",
            imageRes = R.drawable.ic_male,
            imageDes = "Male Gender Image",
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FemaleGenderCard(modifier: Modifier, onClick: () -> Unit) {
    Card(
        onClick = onClick, modifier = modifier

    ) {
        GenderCardContent(
            text = "Female",
            imageRes = R.drawable.ic_female,
            imageDes = "Female Gender Image",
        )
    }
}


@Composable
fun GenderCardContent(text: String, imageRes: Int, imageDes: String) {
    Image(
        painter = painterResource(
            id = imageRes,
        ),
        contentDescription = imageDes,
    )
    Text(text = text)
}
