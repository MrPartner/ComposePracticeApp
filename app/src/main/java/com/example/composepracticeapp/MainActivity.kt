package com.example.composepracticeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import com.example.composepracticeapp.loginbasico.LoginScreen
import com.example.composepracticeapp.recyclerview.SuperHeroView
import com.example.composepracticeapp.tuit.TuitDivider
import com.example.composepracticeapp.tuit.TwitterCard
import com.example.composepracticeapp.ui.theme.ComposePracticeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            SuperHeroView()

                        }

                    }
                }
            }
        }
    }
}
