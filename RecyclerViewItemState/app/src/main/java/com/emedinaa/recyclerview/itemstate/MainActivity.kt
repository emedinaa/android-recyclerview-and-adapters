package com.emedinaa.recyclerview.itemstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emedinaa.recyclerview.itemstate.databinding.ActivityMainBinding

/**
 * @author Eduardo Medina
 * https://developer.android.com/topic/libraries/view-binding
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var vegetableAdapter: VegetableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        vegetableAdapter = VegetableAdapter(VegetablesData.vegetableList()) {
            toast("Item $it")
        }
        binding.recyclerView.adapter = vegetableAdapter
    }
}