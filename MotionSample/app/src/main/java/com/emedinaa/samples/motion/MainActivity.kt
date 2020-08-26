package com.emedinaa.samples.motion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOf(button,button2).forEach { it ->
            it.setOnClickListener {itView ->
                startActivity(Intent(this,
                when(itView.id){
                    R.id.button -> BottomSBehaviorActivity::class.java
                    else -> MotionActivity::class.java
                }))
            }
        }
    }
}