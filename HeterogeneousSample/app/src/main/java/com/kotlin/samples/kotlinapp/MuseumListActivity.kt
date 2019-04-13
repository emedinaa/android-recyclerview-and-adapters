package com.kotlin.samples.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kotlin.samples.kotlinapp.adapters.HeterogeneousAdapter
import com.kotlin.samples.kotlinapp.data.MuseumData
import com.kotlin.samples.kotlinapp.model.Museum
import kotlinx.android.synthetic.main.activity_museum_list.*

class MuseumListActivity : AppCompatActivity() {

    private lateinit var adapter:HeterogeneousAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var museums:MutableList<Museum> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum_list)

        //layout manager
        viewManager = LinearLayoutManager(this)
        //viewManager = GridLayoutManager(this,3)
        recyclerView.layoutManager=viewManager

        //load museums
        museums= mutableListOf()
        val headerList= MuseumData.headerMuseumList()
        val itemList = MuseumData.museumList()

        museums.addAll(headerList)
        museums.addAll(itemList)

        adapter= HeterogeneousAdapter(this,headerList,itemList)

        recyclerView.adapter=adapter

    }

}
