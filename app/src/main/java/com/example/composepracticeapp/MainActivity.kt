package com.example.composepracticeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepracticeapp.ui.theme.ComposePracticeAppTheme
import com.example.composepracticeapp.uilayouts.basicslayouts.MyRow
import com.example.composepracticeapp.uilayouts.controlselection.CheckInfo
import com.example.composepracticeapp.uilayouts.controlselection.MyCheckBoxWithTextCompleted
import com.example.composepracticeapp.uilayouts.controlselection.MyRadioButtonList
import com.example.composepracticeapp.uilayouts.texttextfield.MyTextFieldAdvance2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {

                        /* /1 CB state hoisting
                        val myOptions =
                            getOptions(listOf("Ejemplo1", "Ejemplo2", "Ejemplo3", "Ejemplo4"))
                        Column (){
                            myOptions.forEach {
                                MyCheckBoxWithTextCompleted(it)
                            }
                        } /1 */ //CB state hoisting

                        //2 RB state hoisting
                        var selected by rememberSaveable {
                            mutableStateOf("Ejemplo1")
                        }
                        Column {
                            MyRadioButtonList(selected) { selected = it }
                        } //2 RB state hoisting

                    }
                }
            }
        }
    }
}

//ChechBox state hoisting  1
@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable {
            mutableStateOf(false)
        }
        CheckInfo(
            title = it,
            selected = status,
            onCheckedChange = { status = it }
        )
    }
}
/////////////////////////////////////

