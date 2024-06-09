package com.example.composepracticeapp.uilayouts.controlselection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyRadioButton() {
    Row(modifier = Modifier.fillMaxWidth()) {
        RadioButton(
            selected = true, onClick = { /*TODO*/ },
            enabled = true,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green,
            )
        )
        Text(text = "Ejemplo 1", modifier = Modifier.padding(top = 14.dp))
    }
}


@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Row() {
            RadioButton(selected = name == "Ejemplo1", onClick = { onItemSelected("Ejemplo1") })
            Text(text = "Ejemplo 1", modifier = Modifier.padding(top = 14.dp))
        }
        Row() {
            RadioButton(selected = name == "Ejemplo2", onClick = { onItemSelected("Ejemplo2") })
            Text(text = "Ejemplo 2", modifier = Modifier.padding(top = 14.dp))
        }
        Row() {
            RadioButton(selected = name == "Ejemplo3", onClick = { onItemSelected("Ejemplo3") })
            Text(text = "Ejemplo 3", modifier = Modifier.padding(top = 14.dp))
        }
        Row() {
            RadioButton(selected = name == "Ejemplo4", onClick = { onItemSelected("Ejemplo4") })
            Text(text = "Ejemplo 4", modifier = Modifier.padding(top = 14.dp))
        }
    }

}