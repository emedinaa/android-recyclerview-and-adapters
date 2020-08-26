package com.emedinaa.samples.motion

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author : Eduardo Medina
 */
@Parcelize
data class Vegetable(val id: Int, val name: String, val image: Int) : Parcelable