package com.example.composepracticeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepracticeapp.ui.theme.ComposePracticeAppTheme
import com.example.composepracticeapp.uilayouts.basicslayouts.MyRow
import com.example.composepracticeapp.uilayouts.controlselection.CheckInfo
import com.example.composepracticeapp.uilayouts.controlselection.MyCheckBoxWithTextCompleted
import com.example.composepracticeapp.uilayouts.controlselection.MyRadioButtonList
import com.example.composepracticeapp.uilayouts.dialogs.MyAlertDialog
import com.example.composepracticeapp.uilayouts.dialogs.MyConfirmationDialog
import com.example.composepracticeapp.uilayouts.dialogs.MyCustomDialog
import com.example.composepracticeapp.uilayouts.dialogs.MySImpleCustomDialog
import com.example.composepracticeapp.uilayouts.otherlayouts.MyDropdownMenu
import com.example.composepracticeapp.uilayouts.texttextfield.MyTextFieldAdvance2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {

                        var show by rememberSaveable {
                            mutableStateOf(false)
                        }
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Button(onClick = { show = true }) {
                                Text(text = "Mostrar dialogo")
                            }
                        }
                        MyConfirmationDialog(show = show, onDismiss = { show = false })

                    }
                }
            }
        }
    }
}
