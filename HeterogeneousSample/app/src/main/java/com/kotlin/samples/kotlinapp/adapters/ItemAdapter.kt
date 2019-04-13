package com.kotlin.samples.kotlinapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.ItemMuseum

class ItemAdapter(private val museums:List<ItemMuseum>):RecyclerView.Adapter<ItemAdapter.MViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_item_museum, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        val museum= museums[position]

        //render
        vh.textViewName.text= museum.name
        vh.imageView.setImageResource(museum.photo)

    }

    override fun getItemCount(): Int {
        return museums.size
    }

    class MViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val textViewName:TextView= view.findViewById(R.id.textViewName)
        val imageView:ImageView= view.findViewById(R.id.imageView)
        val textViewLink:TextView= view.findViewById(R.id.textViewLink)
        val imageViewFavorite:ImageView= view.findViewById(R.id.imageViewFavorite)
    }

}