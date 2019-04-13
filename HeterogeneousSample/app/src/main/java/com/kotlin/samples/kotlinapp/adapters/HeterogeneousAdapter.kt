package com.kotlin.samples.kotlinapp.adapters

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.HeaderMuseum
import com.kotlin.samples.kotlinapp.model.ItemMuseum
import com.kotlin.samples.kotlinapp.model.Museum

class HeterogeneousAdapter(val context:Context,val hMuseumList:List<HeaderMuseum>,val items:List<ItemMuseum>): RecyclerView.Adapter<HeterogeneousAdapter.ViewHolder>() {

    companion object {
        private const val ITEM = 1
        private const val HEADER = 2
    }

    var data:MutableList<Museum> = mutableListOf()

    init {
       data.add(HeaderMuseum(-1,"",-1,false))
       data.add(ItemMuseum(-1,"",-1,false))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeterogeneousAdapter.ViewHolder {
        /*return  when(viewType){
                HEADER -> ViewHolder(inflater.inflate(R.layout.row,parent,false))
                ITEM -> ViewHolder(inflater.inflate(R.layout.row,parent,false))
                else -> ViewHolder(inflater.inflate(R.layout.row,parent,false))
            }*/
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.row, parent, false))
    }

    override fun onBindViewHolder(vh: ViewHolder, position: Int) {
        when(vh.itemViewType){
            HEADER -> renderHeader(vh)
            ITEM -> renderItem(vh)
            else -> renderItem(vh)
        }
    }

    private fun renderHeader(holder:ViewHolder){
        val adapter= HeaderAdapter(hMuseumList)
        //render
        holder.recyclerView.layoutManager= LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,
                false)
        holder.recyclerView.adapter= adapter
    }

    private fun renderItem(holder:ViewHolder){
        val adapter= ItemAdapter(items)
        //render
        holder.recyclerView.layoutManager= LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        holder.recyclerView.adapter= adapter
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            data[position].isHeader() -> HEADER
            data[position].isItem() -> ITEM
            else -> -1
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
    }
}