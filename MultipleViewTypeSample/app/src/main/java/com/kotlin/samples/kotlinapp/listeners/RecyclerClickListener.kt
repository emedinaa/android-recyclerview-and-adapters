package com.kotlin.samples.kotlinapp.listeners

import android.view.View

/**
 * @author : Eduardo Medina
 * @since : 11/17/18
 * @see : https://developer.android.com/index.html
 */
interface RecyclerClickListener {

    fun onClick(view: View, position: Int)
    fun onLongClick(view: View, position: Int)
}