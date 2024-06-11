package com.example.composepracticeapp.uilayouts.m3catalog

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyButton3a() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red
        )
    ) {
        Text(text = "Pulsar")
    }
}

@Composable
fun MyButton3b() {
    Button(onClick = { }) {
        Text(text = "Pulsar")
    }
}

//Este seria un boton secundario de menor relevancia con colores mas claros o secundarios

@Composable
fun MyFilledTonalButton() {
    FilledTonalButton(
        onClick = { /*TODO*/ }, colors = ButtonDefaults.filledTonalButtonColors(
            containerColor = Color.DarkGray
        )
    ) {
        Text(text = "Pulsar")
    }
}

//tiene la misma finalidad que el FilledTonalButton
@Composable
fun MyElevatedButton() {
    ElevatedButton(onClick = { }) {
        Text(text = "Pulsar")
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyFloatingActionButton3() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        contentColor = Color.Blue,
        containerColor = Color.Red
    ) {
        Icon(Icons.Filled.Favorite, "Floatin action button")
    }
}
