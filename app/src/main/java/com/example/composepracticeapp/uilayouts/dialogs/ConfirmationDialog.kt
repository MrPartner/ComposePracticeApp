package com.example.composepracticeapp.uilayouts.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.composepracticeapp.uilayouts.controlselection.MyRadioButtonList

@Composable
fun MyConfirmationDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Card(
                modifier = Modifier, elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                ), shape = MaterialTheme.shapes.small
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    MyTitleDialog(text = "Phone ringtone")
                    Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                    var status by rememberSaveable {
                        mutableStateOf("")
                    }
                    MyRadioButtonList(status) { status = it }
                    Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                    Row(
                        modifier = Modifier
                            .align(Alignment.End)
                            .padding(8.dp)
                    ) {
                        TextButton(onClick = { }) {
                            Text(text = "CANCEL")
                        }
                        TextButton(onClick = { }) {
                            Text(text = "OK")
                        }
                    }
                }
            }
        }
    }
}