package com.emedinaa.recyclerview.itemstate

import android.content.Context
import android.widget.Toast

/**
 * @author Eduardo Medina
 */
fun Context.toast(message: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, duration).show()
}