package com.emedinaa.recyclerview.multipleselection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Eduardo Medina
 */
class VegetableAdapter(val vegetables: List<Vegetable>) :
    RecyclerView.Adapter<VegetableAdapter.ViewHolder>() {

    private val mutableSelectedList = mutableListOf<Vegetable>()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(vh: ViewHolder, position: Int) {
        vh.bind(vegetables[position])
    }

    override fun getItemCount(): Int = vegetables.size

    fun showSelectedItems(): List<Vegetable> {
        return mutableSelectedList.toList()
    }

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val textViewName = view.findViewById<TextView>(R.id.textViewName)
        private val imageViewCheck = view.findViewById<ImageView>(R.id.imageViewCheck)

        private fun updateRow(model: Vegetable) {
            val resource =
                if (mutableSelectedList.contains(model)) R.drawable.ic_checked else R.drawable.ic_normal
            imageViewCheck.setImageResource(resource)
        }

        fun bind(model: Vegetable) {
            textViewName.text = model.name
            updateRow(model)

            view.setOnClickListener {
                if (mutableSelectedList.contains(model)) {
                    mutableSelectedList.remove(model)
                } else {
                    mutableSelectedList.add(model)
                }
                notifyItemChanged(vegetables.indexOf(model))
            }
        }
    }

}