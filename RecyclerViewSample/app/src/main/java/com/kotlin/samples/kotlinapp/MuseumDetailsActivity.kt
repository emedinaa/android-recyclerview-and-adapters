package com.kotlin.samples.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.samples.kotlinapp.model.Museum
import kotlinx.android.synthetic.main.activity_museum_details.*

class MuseumDetailsActivity : AppCompatActivity() {

    private var museum:Museum?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum_details)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        verifyExtras()

        populate()
    }

    private fun populate(){
        museum?.let {
            textViewName.text= it.name
            imageView.setImageResource(it.photo)
        }
    }

    private fun verifyExtras(){
        intent?.extras?.let {

            if(it.getSerializable("MUSEUM") is Museum){
                museum= it.getSerializable("MUSEUM") as Museum
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
