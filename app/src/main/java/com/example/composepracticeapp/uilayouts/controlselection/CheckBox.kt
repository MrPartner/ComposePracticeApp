package com.example.composepracticeapp.uilayouts.controlselection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }
    Checkbox(
        checked = state, onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Green,
            uncheckedColor = Color.Red,
            checkmarkColor = Color.Black
        )
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCheckBoxWithText() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.padding(8.dp)) {
            Checkbox(checked = state, onCheckedChange = { state = !state })
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = "Ejemplo 1", modifier = Modifier.padding(top = 13.dp))

        }
        Row(modifier = Modifier.padding(8.dp)) {
            Checkbox(checked = state, onCheckedChange = { state = !state })
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = "Ejemplo 1", modifier = Modifier.padding(top = 13.dp))

        }
    }

}


@Composable
fun MyCheckBoxWithTextCompleted(checkInfo: CheckInfo) {
    Column() {
        Row(modifier = Modifier.padding(8.dp)) {
            Checkbox(
                checked = checkInfo.selected,
                onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) })
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = checkInfo.title, modifier = Modifier.padding(top = 13.dp))

        }
    }

}

@Composable
fun MyTriStatusCheckBox(){
    var status by rememberSaveable {
        mutableStateOf(ToggleableState.Off)
    }
    TriStateCheckbox(state = status, onClick = {
        status = when(status){
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}