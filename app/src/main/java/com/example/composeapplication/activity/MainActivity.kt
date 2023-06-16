package com.example.composeapplication.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapplication.ui.navigation.NavGraph
import com.example.composeapplication.ui.theme.SimpleNavComposeAppTheme


class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {

        SimpleNavComposeAppTheme {
            val navController = rememberNavController()
            NavGraph(navController)
        }
    }
}