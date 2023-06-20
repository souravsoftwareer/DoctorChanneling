package com.example.composeapplication.ui.theme



import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.composeapplication.R


val FontName = FontFamily(
    Font(R.font.regular, weight = FontWeight.Normal),
    Font(R.font.light, weight = FontWeight.Light),
    Font(R.font.bold, weight = FontWeight.Bold),
    Font(R.font.italic, weight = FontWeight.Thin)
)