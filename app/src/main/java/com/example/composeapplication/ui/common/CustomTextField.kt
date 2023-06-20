package com.example.composeapplication.ui.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField(
    placeholderText:String = "",
    onValueChange:(text:String)->Unit
) {
    val inputValue = remember { mutableStateOf(TextFieldValue()) }


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

            // modifier is use to add padding
            // to our text field.
            modifier = Modifier.padding(all = 2.dp).fillMaxWidth()

        )

}