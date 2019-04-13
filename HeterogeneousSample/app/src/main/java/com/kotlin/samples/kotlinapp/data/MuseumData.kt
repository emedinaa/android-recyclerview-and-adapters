package com.kotlin.samples.kotlinapp.data

import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.HeaderMuseum
import com.kotlin.samples.kotlinapp.model.ItemMuseum
import com.kotlin.samples.kotlinapp.model.Museum

object MuseumData {

    fun headerMuseumList():List<HeaderMuseum>{
        val museums:MutableList<HeaderMuseum> = arrayListOf()
        museums.add(HeaderMuseum(1,"Museo Nacional de Arqueología, Antropología e Historia del Perú",
                R.drawable.ic_01))
        museums.add(HeaderMuseum(2,"Museo de Sitio Pachacamac",
                R.drawable.ic_02))
        museums.add(HeaderMuseum(3,"Casa Museo José Carlos Mariátegui'",
                R.drawable.ic_03))
        museums.add(HeaderMuseum(4,"Museo de Sitio Julio C. Tello' de Paracas",
                R.drawable.ic_04))

        return museums.toList()
    }

    fun museumList():List<ItemMuseum>{
        val museums:MutableList<ItemMuseum> = arrayListOf()

        museums.add(ItemMuseum(6,"Museo de Arte Italiano",
                R.drawable.ic_07))
        museums.add(ItemMuseum(7,"Museo de Sitio \"Arturo Jiménez Borja\" - Puruchuco",
                R.drawable.ic_08))
        museums.add(ItemMuseum(8,"Lugar de la Memoria, la Tolerancia y la Inclusión Social",
                R.drawable.ic_09))
        museums.add(ItemMuseum(9,"Museo Nacional de la Cultura Peruana", R.drawable.ic_01))

        museums.add(ItemMuseum(1,"Museo Nacional de Arqueología, Antropología e Historia del Perú",
                R.drawable.ic_01))
        museums.add(ItemMuseum(2,"Museo de Sitio Pachacamac",
                R.drawable.ic_02))
        museums.add(ItemMuseum(3,"Casa Museo José Carlos Mariátegui'",
                R.drawable.ic_03))
        museums.add(ItemMuseum(4,"Museo de Sitio Julio C. Tello' de Paracas",
                R.drawable.ic_04))
        museums.add(ItemMuseum(5,"Museo Regional de Ica",
                R.drawable.ic_05))

        return museums.toList()
    }
}