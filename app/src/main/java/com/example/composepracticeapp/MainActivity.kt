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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composepracticeapp.navigation.Routes
import com.example.composepracticeapp.navigation.Screen1
import com.example.composepracticeapp.navigation.Screen2
import com.example.composepracticeapp.navigation.Screen3
import com.example.composepracticeapp.navigation.Screen4
import com.example.composepracticeapp.navigation.Screen5
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
                        NavHost(
                            navController = navigationController,
                            startDestination = Routes.Pantalla1.route
                        ) {
                            composable(Routes.Pantalla1.route) { Screen1(navigationController) }
                            composable(Routes.Pantalla2.route) { Screen2(navigationController) }
                            composable(Routes.Pantalla3.route) { Screen3(navigationController) }
                            composable(
                                Routes.Pantalla4.route,
                                arguments = listOf(navArgument("age") { type = NavType.IntType })
                            ) { backStackEntry ->
                                Screen4(
                                    navigationController,
                                    backStackEntry.arguments?.getInt("age") ?: 0
                                )
                            }
                            composable(
                                Routes.Pantalla5.route,
                                arguments = listOf(navArgument("name") { defaultValue = "Pepe" })
                            ) { backStackEntry ->
                                Screen5(
                                    navigationController,
                                    backStackEntry.arguments?.getString("name").orEmpty()
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
