package com.kotlin.samples.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.kotlin.samples.kotlinapp.adapters.MuseumAdapter
import com.kotlin.samples.kotlinapp.data.MuseumData
import com.kotlin.samples.kotlinapp.extensions.toast
import com.kotlin.samples.kotlinapp.listeners.AdapterCallback
import com.kotlin.samples.kotlinapp.listeners.RecyclerClickListener
import com.kotlin.samples.kotlinapp.listeners.RecyclerTouchListener
import com.kotlin.samples.kotlinapp.model.Museum
import kotlinx.android.synthetic.main.activity_museum_list.*

class MuseumListActivity : AppCompatActivity(),AdapterCallback {

    private lateinit var museumAdapter:MuseumAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var museums:List<Museum> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museum_list)

        //layout manager
        viewManager = LinearLayoutManager(this)
        //viewManager = GridLayoutManager(this,3)
        recyclerView.layoutManager=viewManager

        //load museums
        museums= MuseumData.museumList()
        museumAdapter= MuseumAdapter(museums,this)

        recyclerView.adapter=museumAdapter

        //events
        recyclerView.addOnItemTouchListener(RecyclerTouchListener(
                this,recyclerView,object: RecyclerClickListener {
            override fun onClick(view: View, position: Int) {
                //showItem(position)
                val museum= museums[position]
                goToMuseum(museum)
            }

            override fun onLongClick(view: View, position: Int) {}
        }
        ))

    }

    private fun goToMuseum(museum:Museum){
        val intent= Intent(this,MuseumDetailsActivity::class.java)
        val bundle= Bundle()
        bundle.putSerializable("MUSEUM",museum)
        intent.putExtras(bundle)

        startActivity(intent)
    }

    private fun showItem(position: Int){
      //Toast.makeText(this, )
      toast(museums[position].toString(),Toast.LENGTH_SHORT)
    }

    override fun onItemSelected(museum: Museum) {
        goToMuseum(museum)
    }

}
