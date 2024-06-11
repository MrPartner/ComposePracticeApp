package com.example.composepracticeapp.loginbasico

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen() {
    Header()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Header() {
    Icon(imageVector = Icons.Default.Close, contentDescription = "close app")
}
