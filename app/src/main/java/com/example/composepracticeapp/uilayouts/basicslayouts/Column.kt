package com.example.composepracticeapp.uilayouts.basicslayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyColumn() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Ejemplo1", modifier = Modifier.background(Color.Red).weight(1f))
        Text(text = "Ejemplo2", modifier = Modifier.background(Color.Black).weight(1f))
        Text(text = "Ejemplo3", modifier = Modifier.background(Color.Cyan).weight(1f))
        Text(text = "Ejemplo4", modifier = Modifier.background(Color.Blue).weight(1f))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyColumn2() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text(
            text = "Ejemplo1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
                , color = Color.White, fontSize = 20.sp, fontStyle = FontStyle.Italic
        )
        Text(
            text = "Ejemplo2",
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3",
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}