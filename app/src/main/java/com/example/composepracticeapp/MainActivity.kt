package com.example.composepracticeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composepracticeapp.navigation.Screen1
import com.example.composepracticeapp.navigation.Screen2
import com.example.composepracticeapp.navigation.Screen3
import com.example.composepracticeapp.ui.theme.ComposePracticeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {

                        val navigationController = rememberNavController()
                        NavHost(navController = navigationController, startDestination = "pantalla1"){
                            composable("pantalla1"){ Screen1(navigationController)}
                            composable("pantalla2"){ Screen2(navigationController)}
                            composable("pantalla3"){ Screen3(navigationController) }
                        }
                    }
                }
            }
        }
    }
}
