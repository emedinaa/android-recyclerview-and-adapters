package com.kotlin.samples.kotlinapp.data

import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.Museum

object MuseumData {

    fun museumList():List<Museum>{
        val museums:MutableList<Museum> = arrayListOf()
        museums.add(Museum(1,"Museo Nacional de Arqueología, Antropología e Historia del Perú",
                R.drawable.ic_01))
        museums.add(Museum(2,"Museo de Sitio Pachacamac",
                R.drawable.ic_02))
        museums.add(Museum(3,"Casa Museo José Carlos Mariátegui'",
                R.drawable.ic_03))
        museums.add(Museum(4,"Museo de Sitio Julio C. Tello' de Paracas",
                R.drawable.ic_04))
        museums.add(Museum(5,"Museo Regional de Ica",
                R.drawable.ic_05))
        museums.add(Museum(6,"Museo de Arte Italiano",
                R.drawable.ic_07))
        museums.add(Museum(7,"Museo de Sitio \"Arturo Jiménez Borja\" - Puruchuco",
                R.drawable.ic_08))
        museums.add(Museum(8,"Lugar de la Memoria, la Tolerancia y la Inclusión Social",
                R.drawable.ic_09))
        museums.add(Museum(9,"Museo Nacional de la Cultura Peruana", R.drawable.ic_01))

        return museums.toList()
    }
}