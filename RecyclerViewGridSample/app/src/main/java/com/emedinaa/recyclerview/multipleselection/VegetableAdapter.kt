package com.emedinaa.recyclerview.multipleselection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_number.view.*

class VegetableAdapter(private val vegetables: List<Vegetable>) :
    RecyclerView.Adapter<VegetableAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_number, parent, false)
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
            view.textView.text = model.id.toString()
        }
    }

}