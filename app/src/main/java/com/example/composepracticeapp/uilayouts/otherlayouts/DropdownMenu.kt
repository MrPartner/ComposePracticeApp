package com.example.composepracticeapp.uilayouts.otherlayouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyDropdownMenu() {
    Column(modifier = Modifier.padding(20.dp)) {
        var selectedText by rememberSaveable {
            mutableStateOf("")
        }
        var expanded by rememberSaveable {
            mutableStateOf(false)
        }
        val desserts = listOf("helado", "chocolate","fruta","natillas","chilaquiles")
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            desserts.forEach { desserts ->
                DropdownMenuItem(text = { desserts }, onClick = {
                    expanded = false
                    selectedText = desserts
                })
            }
        }
    }
}