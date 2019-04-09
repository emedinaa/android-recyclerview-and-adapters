package com.kotlin.samples.kotlinapp.data

import com.kotlin.samples.kotlinapp.R
import com.kotlin.samples.kotlinapp.model.ViewType
import com.kotlin.samples.kotlinapp.model.ViewTypeA
import com.kotlin.samples.kotlinapp.model.ViewTypeB
import com.kotlin.samples.kotlinapp.model.ViewTypeC

object MultipleData {

    fun multipleList():List<ViewType>{
        val mutableList= mutableListOf<ViewType>()
        mutableList.add(ViewTypeA(1,"item 1"))
        mutableList.add(ViewTypeA(2,"item 2"))

        mutableList.add(ViewTypeB(3,"item 3"))
        mutableList.add(ViewTypeB(4,"item 4"))

        mutableList.add(ViewTypeC(5,"item 5"))
        mutableList.add(ViewTypeC(6,"item 6"))

        return mutableList.toList()
    }
}