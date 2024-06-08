package com.example.composepracticeapp.uilayouts.basicslayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyRow() {
//    Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
//        Text(text = "Ejemplo1")
//        Text(text = "Ejemplo2")
//        Text(text = "Ejemplo3")
//    }
//    Row(modifier = Modifier.fillMaxSize()) {
//        Text(text = "Ejemplo1", modifier = Modifier.weight(1f))
//        Text(text = "Ejemplo2", modifier = Modifier.weight(1f))
//        Text(text = "Ejemplo3", modifier = Modifier.weight(1f))
//    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(text = "Ejemplo1", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Red))
        Text(text = "Ejemplo2", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Cyan))
        Text(text = "Ejemplo3", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Blue))
        Text(text = "Ejemplo4", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Red))
        Text(text = "Ejemplo5", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Black))
        Text(text = "Ejemplo6", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Yellow))
        Text(text = "Ejemplo7", modifier = Modifier
            .width(100.dp)
            .height(50.dp)
            .background(Color.Red))
    }

}