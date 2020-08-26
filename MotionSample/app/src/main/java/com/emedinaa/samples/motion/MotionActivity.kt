package com.emedinaa.samples.motion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_motion_vegetables.*

/**
 * @author : Eduardo Medina
 */
class MotionActivity : AppCompatActivity() {

    private lateinit var vegetableAdapter: VegetableAdapter

    private fun setupUi(){
        vegetableAdapter =
            VegetableAdapter(
                VegetablesData.vegetableList()
            )
        recyclerView.adapter = vegetableAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)
        setupUi()
    }
}