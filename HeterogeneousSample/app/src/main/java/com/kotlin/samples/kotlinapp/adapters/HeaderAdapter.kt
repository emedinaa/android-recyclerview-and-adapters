package com.kotlin.samples.kotlinapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.HeaderMuseum

class HeaderAdapter(val hmuseumList:List<HeaderMuseum>):RecyclerView.Adapter<HeaderAdapter.HViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): HeaderAdapter.HViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_header_museum, parent, false)
        return HeaderAdapter.HViewHolder(view)
    }

    override fun onBindViewHolder(vh: HeaderAdapter.HViewHolder, position: Int) {
        val museum= hmuseumList[position]

        //render
        vh.textViewName.text= museum.name
        vh.imageView.setImageResource(museum.photo)

        //events
    }

    override fun getItemCount(): Int {
        return hmuseumList.size
    }

    class HViewHolder(view: View): RecyclerView.ViewHolder(view) {
       val textViewName: TextView = view.findViewById(R.id.textViewName)
       val imageView: ImageView = view.findViewById(R.id.imageView)
    }
}