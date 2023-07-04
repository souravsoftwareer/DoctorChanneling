package com.example.composeapplication.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.ui.common.CustomTextField
import com.example.composeapplication.ui.common.DefaultButton
import com.example.composeapplication.ui.theme.FontName
import com.example.composeapplication.ui.theme.SimpleNavComposeAppTheme
import com.example.composeapplication.ui.theme.TextColor


@Composable
fun LoginScreen(
    navigateToHome: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Welcome",
                fontSize = 30.sp,
                color = TextColor,
                fontFamily = FontName,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    top = 30.dp,

                    )
            )
        }

        Text(
            "Signin",
            fontSize = 28.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontName
        )
        Text(
            "Korem ipsum dolor sit amet, consectetur adipiscing elit.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontName,
            modifier = Modifier.padding(top = 25.dp)
        )

        CustomTextField(
            label = "Email",
            onValueChange = {

            },
           placeholderText="Enter your email",
           modifier = Modifier.padding(top = 10.dp)
               .fillMaxWidth()
        )

        CustomTextField(
            label = "Password",
            onValueChange = {

            },
           placeholderText="Enter your email",
           modifier = Modifier.padding(top = 10.dp)
               .fillMaxWidth()
        )

//        DefaultButton(
//            text = "Log In",
//            onClick = navigateToHome
//        )

    }

}

@Preview()
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LoginScreen(
                navigateToHome = {}
            )
        }
    }
}