package com.kotlin.samples.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.kotlin.samples.kotlinapp.adapters.MultipleAdapter
import com.kotlin.samples.kotlinapp.data.MultipleData
import com.kotlin.samples.kotlinapp.extensions.toast
import com.kotlin.samples.kotlinapp.listeners.RecyclerClickListener
import com.kotlin.samples.kotlinapp.listeners.RecyclerTouchListener
import com.kotlin.samples.kotlinapp.model.ViewType
import kotlinx.android.synthetic.main.activity_multiple_list.*

class MultipleListActivity : AppCompatActivity() {

    private lateinit var multipleAdapter:MultipleAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var multipleList:List<ViewType> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_list)

        //layout manager
        viewManager = LinearLayoutManager(this)
        //viewManager = GridLayoutManager(this,3)
        recyclerView.layoutManager=viewManager

        //load museums
        multipleList= MultipleData.multipleList()
        multipleAdapter= MultipleAdapter(multipleList)

        recyclerView.adapter=multipleAdapter

        //events
        recyclerView.addOnItemTouchListener(RecyclerTouchListener(
                this,recyclerView,object: RecyclerClickListener {
            override fun onClick(view: View, position: Int) {
                showItem(position)
            }

            override fun onLongClick(view: View, position: Int) {}
        }))

    }


    private fun showItem(position: Int){
      toast(multipleList[position].toString(),Toast.LENGTH_SHORT)
    }


}
