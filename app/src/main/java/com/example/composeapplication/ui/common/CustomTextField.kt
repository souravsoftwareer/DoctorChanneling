package com.example.composeapplication.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapplication.R
import com.example.composeapplication.ui.theme.FontName

@Composable
fun CustomTextField(
    modifier: Modifier,
    placeholderText: String = "",
    label: String = "",
    isEyeOpen:Boolean = true,
    onEyeChange: (isEyeOpen: Boolean) -> Unit,
    onValueChange: (text: String) -> Unit
) {
    val inputValue = remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 10.dp
            )
    ) {
        Text(
            label,
            fontSize = 22.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontName,
            modifier = Modifier.padding(top = 15.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            TextField(
                // below line is used to get
                // value of text field,
                value = inputValue.value,

                // below line is used to get value in text field
                // on value change in text field.
                onValueChange = {
                    inputValue.value = it
                    onValueChange.invoke(it.text)
                },

                // below line is used to add placeholder
                // for our text field.
                placeholder = { Text(text = placeholderText) },
                modifier = modifier.border(1.dp, Color.Black, shape = RoundedCornerShape(15.dp)),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    textColor = Color.Black
                )
                // modifier is use to add padding
                // to our text field.

            )
            Image(
                painter = painterResource(id = R.drawable.close_eye),
                contentDescription = "",
                modifier = Modifier.size(300.dp)
            )



        }
    }


}