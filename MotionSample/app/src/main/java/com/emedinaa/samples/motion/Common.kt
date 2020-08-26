package com.emedinaa.samples.motion

import android.content.Context
import android.widget.Toast

/**
 * @author : Eduardo Medina
 */
fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
