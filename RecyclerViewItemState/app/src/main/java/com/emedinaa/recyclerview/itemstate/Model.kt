package com.emedinaa.recyclerview.itemstate

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Eduardo Medina
 * https://developer.android.com/kotlin/parcelize
 */
@Parcelize
data class Vegetable(val id: Int, val name: String, val image: Int, val state:Int) : Parcelable