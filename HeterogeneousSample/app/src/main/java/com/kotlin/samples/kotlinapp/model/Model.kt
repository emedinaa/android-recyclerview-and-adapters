package com.kotlin.samples.kotlinapp.model

import java.io.Serializable

/**
 * @author : Eduardo Medina
 * @since : 11/17/18
 * @see : https://developer.android.com/index.html
 */

open class Museum(val id:Int, val name:String, val  photo:Int,
                  val favorite:Boolean=false):Serializable{
    open fun isHeader():Boolean=false
    open fun isItem():Boolean=false
}

class HeaderMuseum(id:Int, name:String, photo:Int, favorite:Boolean=false):Museum(id,name,photo,favorite){
    override fun isHeader(): Boolean =true
}

class ItemMuseum(id:Int, name:String, photo:Int, favorite:Boolean=false):Museum(id,name,photo,favorite){
    override fun isItem(): Boolean =true
}