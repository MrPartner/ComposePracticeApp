package com.example.composepracticeapp.uilayouts.texttextfield

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyTextField() {
    var myText by rememberSaveable {
        mutableStateOf("")
    }
    TextField(value = myText, onValueChange = { myText = it })
}


@Composable
fun MyTextFieldAdvance() {
    var myText by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = myText,
        onValueChange = { myText = it },
        label = { Text(text = "Introduce tu nombre") })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyTextFieldAdvance2() {
    var myText by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = myText,
        onValueChange = {
            myText = if (it.contains("a")) {
                    it.replace("a","")
                } else {
                    it
                }
        },
        label = { Text(text = "Introduce tu nombre") })
}