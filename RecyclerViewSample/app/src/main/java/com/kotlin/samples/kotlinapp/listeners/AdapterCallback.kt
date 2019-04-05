package com.kotlin.samples.kotlinapp.listeners

import com.kotlin.samples.kotlinapp.model.Museum

interface AdapterCallback {

    fun onItemSelected(museum:Museum)
}