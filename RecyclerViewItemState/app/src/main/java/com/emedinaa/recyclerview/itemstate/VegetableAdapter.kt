package com.emedinaa.recyclerview.itemstate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Eduardo Medina
 */
class VegetableAdapter(
    private val vegetables: List<Vegetable>,
    val itemAction: (item: Vegetable) -> Unit
) : RecyclerView.Adapter<VegetableAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(vegetables[position])
    }

    override fun getItemCount(): Int = vegetables.size

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val textViewName = view.findViewById<TextView>(R.id.textViewName)
        private val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)


        fun bind(model: Vegetable) {
            textViewName.text = "${model.name}  : ${model.state}%"
            progressBar.progress = model.state

            view.setOnClickListener {
                itemAction(model)
            }
        }
    }

}