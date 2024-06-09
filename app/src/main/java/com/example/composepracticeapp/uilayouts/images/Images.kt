package com.example.composepracticeapp.uilayouts.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepracticeapp.R


@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        alpha = 0.5f //Opacidad
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo2",
//        modifier = Modifier.clip(RoundedCornerShape(25)) para redondear las esquinas
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

