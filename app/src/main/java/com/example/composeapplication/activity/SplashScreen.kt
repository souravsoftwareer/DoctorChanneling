package com.example.composeapplication.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.R
import com.example.composeapplication.utils.delay


class SplashScreen:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          splashView()
        }
        delay(5000){
          navigateMain()
        }
    }

   private fun navigateMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    @Preview
    @Composable
    fun splashView() {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription="",
                modifier = Modifier.size(300.dp),
                contentScale = ContentScale.Fit
            )
            Text(
                text = "D O C T O R",
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.regular)),
                color = colorResource(R.color.text)
            )
            Text(
                text = "C H A N N E L I N G",
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.regular)),
                color = colorResource(R.color.text)
            )
        }
    }
}