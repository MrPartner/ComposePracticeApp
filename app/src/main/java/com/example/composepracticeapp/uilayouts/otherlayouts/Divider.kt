package com.example.composepracticeapp.uilayouts.otherlayouts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyDivider() {
    Divider(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 16.dp), color = Color.Red)
}