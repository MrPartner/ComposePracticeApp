package com.example.composepracticeapp.tuit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepracticeapp.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyTuit() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F153A))
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            ProfileImage()
            Spacer(modifier = Modifier.size(16.dp))
            Column() {
                TitleTuit()
                BodyImage()
                Footer()
                DividerFooter()
            }

        }

    }

}

@Composable
fun DividerFooter() {
    HorizontalDivider(modifier = Modifier.fillMaxWidth())
}

@Composable
fun Footer() {
    Spacer(modifier = Modifier.size(16.dp))
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(
            painter = painterResource(id = R.drawable.ic_chat), contentDescription = "ic chat",
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.size(56.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_rt), contentDescription = "ic chat",
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.size(56.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_like), contentDescription = "ic chat",
            tint = Color.Gray
        )

    }


}

@Composable
fun BodyImage() {
    Spacer(modifier = Modifier.size(16.dp))
    Card(modifier = Modifier, shape = MaterialTheme.shapes.large) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Imagen central",
            Modifier.size(245.dp)
        )
    }
}


@Composable
fun TitleTuit() {
    Column {

        Row(
            Modifier
                .fillMaxWidth()
                .height(28.dp)
                .padding(end = 16.dp)
        ) {
            Text(
                text = "Aris",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.size(12.dp))
            Text(
                text = "@AristiDevs  4h",
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = Color(0xFF5F5F5F)
            )
            Spacer(modifier = Modifier.size(50.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_dots),
                contentDescription = "Menu Dots",
                tint = Color.White
            )

        }
        Text(
            text = "Descripcion larga sobre text Descripcion larga sobre text " +
                    "Descripcion larga sobre text Descripcion larga sobre text " +
                    "Descripcion larga sobre text Descripcion larga sobre text ",
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}


@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "foto perfil",
        modifier = Modifier
            .clip(
                CircleShape
            )
            .size(64.dp)
    )
}
