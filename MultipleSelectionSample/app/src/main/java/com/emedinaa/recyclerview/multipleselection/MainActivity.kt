package com.emedinaa.recyclerview.multipleselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.samples.kotlinapp.adapters.VegetableAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var vegetableAdapter:VegetableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        vegetableAdapter = VegetableAdapter(VegetablesData.vegetableList())

        recyclerView.layoutManager= viewManager
        recyclerView.adapter = vegetableAdapter

        textViewSelected.setOnClickListener {
            var message = StringBuffer()
            vegetableAdapter.showSelectedItems().forEach {
                message.appendln("id : ${it.id}  name : ${it.name}")
            }
            toast("Selected items:\n $message")
        }
    }
}
