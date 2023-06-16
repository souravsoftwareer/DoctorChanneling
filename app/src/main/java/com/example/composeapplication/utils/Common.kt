package com.example.composeapplication.utils

import android.os.Handler
import android.os.Looper

fun delay(milliseconds: Long, toBeDone: () -> Unit) {
    Handler(Looper.getMainLooper()).postDelayed(
        {
            toBeDone.invoke()
        },
        milliseconds
    )
}