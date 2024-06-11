package com.example.composepracticeapp.uilayouts.scaffold


import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScaffoldExample() {
    Scaffold(topBar = { MyTopAppBar() }, modifier = Modifier.padding(8.dp)) {
        it
    }
}

/////////////////// tiene problemas
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
        TopAppBar(
            title = { Text(text = "Mi primera toolbar") }, colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.Cyan,
            ), navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "back")
                }
            },
            actions = {
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
                }
            }
        )
}