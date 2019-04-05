package com.kotlin.samples.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.samples.kotlinapp.listeners.OnFragmentInteractionListener

class MuseumListFragActivity : AppCompatActivity(),OnFragmentInteractionListener{

    override fun onFragmentInteraction(any: Any?) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum_list_frag)
    }


}
