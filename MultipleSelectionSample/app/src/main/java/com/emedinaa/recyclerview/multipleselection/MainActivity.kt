package com.emedinaa.recyclerview.multipleselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emedinaa.recyclerview.multipleselection.databinding.ActivityMainBinding

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

        binding.textViewSelected.setOnClickListener {
            val message = StringBuffer()
            vegetableAdapter.showSelectedItems().forEach {
                message.appendLine("id : ${it.id}  name : ${it.name}")
            }
            toast("Selected items:\n$message")
        }

        vegetableAdapter = VegetableAdapter(VegetablesData.vegetableList())
        binding.recyclerView.adapter = vegetableAdapter
    }
}