package com.example.composepracticeapp.uilayouts.buttons


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyButton() {
    var enabled by rememberSaveable {
        mutableStateOf(true)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { enabled = false },
            enabled = enabled, // Habilitamos el button, opcional
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Green,
                disabledContainerColor = Color.LightGray,
                disabledContentColor = Color.Black,
            ),
            border = BorderStroke(5.dp, Color.Yellow)
        ) {
            Text(text = "Pulsar")
        }



        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Black,
                disabledContainerColor = Color.Magenta,
                disabledContentColor = Color.Green,
            ),
        ) {
            Text(text = "Pulsar")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Pulsar")
        }
    }
}

