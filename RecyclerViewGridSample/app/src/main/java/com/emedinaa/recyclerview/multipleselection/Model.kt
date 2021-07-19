package com.emedinaa.recyclerview.multipleselection

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Vegetable(val id:Int, val name:String, val  image:Int):Parcelable