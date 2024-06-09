package com.example.composepracticeapp.uilayouts.images


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyIcon() {
    Icon(imageVector = Icons.Rounded.Star, contentDescription = "StarIcon",
        tint = Color.Red
    )
}