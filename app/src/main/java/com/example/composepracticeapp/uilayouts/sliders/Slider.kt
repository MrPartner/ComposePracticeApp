package com.example.composepracticeapp.uilayouts.sliders

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MySlider() {
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        var sliderPosition by rememberSaveable {
            mutableStateOf(0f)
        }
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
        Text(text = sliderPosition.toString())

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AdvanceSlider(){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        var sliderPosition by rememberSaveable {
            mutableStateOf(0f)
        }
        var completeValue by rememberSaveable {
            mutableStateOf("")
        }
        Slider(value = sliderPosition, onValueChange = { sliderPosition = it },
            onValueChangeFinished = {completeValue = sliderPosition.toString()},
            valueRange = 0f..10f,
            steps = 9,
            enabled = true
            )
        Text(text = completeValue)

    }
}