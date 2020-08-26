package com.emedinaa.samples.motion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item.view.*

/**
 * @author : Eduardo Medina
 */
class VegetableAdapter(private val vegetables: List<Vegetable>) :
    RecyclerView.Adapter<VegetableAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(vh: ViewHolder, position: Int) {
        vh.bind(vegetables[position])
    }

    override fun getItemCount(): Int {
        return vegetables.size
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(model: Vegetable) {
            view.textViewName.text = model.name
            view.imageViewCheck.setImageResource(R.drawable.ic_normal)

            view.setOnClickListener {}
        }
    }

}