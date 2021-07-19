package com.emedinaa.recyclerview.multipleselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var vegetableAdapter:VegetableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = GridLayoutManager(this,4)
        vegetableAdapter = VegetableAdapter(VegetablesData.vegetableList())

        recyclerView.layoutManager= viewManager
        recyclerView.adapter = vegetableAdapter
    }
}
