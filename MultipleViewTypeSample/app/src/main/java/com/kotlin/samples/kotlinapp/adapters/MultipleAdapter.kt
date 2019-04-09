package com.kotlin.samples.kotlinapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.ViewType

class MultipleAdapter(val multipleList:List<ViewType>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    companion object {
        const val VIEW_TYPE_A:Int=0
        const val VIEW_TYPE_B:Int=1
        const val VIEW_TYPE_C:Int=2
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return  when(viewType){
            VIEW_TYPE_A -> TypeAViewHolder(inflater.inflate(R.layout.row_view_type_a,parent,false))
            VIEW_TYPE_B -> TypeBViewHolder(inflater.inflate(R.layout.row_view_type_b,parent,false))
            VIEW_TYPE_C -> TypeCViewHolder(inflater.inflate(R.layout.row_view_type_c,parent,false))
            else -> TypeCViewHolder(inflater.inflate(R.layout.row_view_type_c,parent,false))
        }
    }

    override fun onBindViewHolder(vh: RecyclerView.ViewHolder, position: Int) {
        when(vh.itemViewType){
            VIEW_TYPE_A -> renderTypeA(vh as TypeAViewHolder,position)
            VIEW_TYPE_B -> renderTypeB(vh as TypeBViewHolder,position)
            VIEW_TYPE_C -> renderTypeC(vh as TypeCViewHolder,position)
            else -> renderTypeC(vh as TypeCViewHolder,position)
        }
    }

    private fun renderTypeA(vh:TypeAViewHolder,position:Int){
        val item= multipleList[position]
        //render
        //vh.textViewName.text= museum.name
        //vh.imageView.setImageResource(museum.photo)
    }

    private fun renderTypeB(vh:TypeBViewHolder,position:Int){}

    private fun renderTypeC(vh:TypeCViewHolder,position:Int){}

    override fun getItemViewType(position: Int): Int {
        return when {
            multipleList[position].isTypeA() -> VIEW_TYPE_A
            multipleList[position].isTypeB() -> VIEW_TYPE_B
            multipleList[position].isTypeC() -> VIEW_TYPE_C
            else -> VIEW_TYPE_C
        }
    }
    override fun getItemCount(): Int {
        return multipleList.size
    }


    class TypeAViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        val textView:TextView= view.findViewById(R.id.textView)
    }

    class TypeBViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        val textView:TextView= view.findViewById(R.id.textView)
    }

    class TypeCViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        val textView:TextView= view.findViewById(R.id.textView)
    }

}