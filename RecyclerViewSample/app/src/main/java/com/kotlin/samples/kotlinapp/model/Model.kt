package com.kotlin.samples.kotlinapp.model

import java.io.Serializable

/**
 * @author : Eduardo Medina
 * @since : 11/17/18
 * @see : https://developer.android.com/index.html
 */

data class Museum(val id:Int, val name:String, val  photo:Int,
                  val favorite:Boolean=false):Serializable