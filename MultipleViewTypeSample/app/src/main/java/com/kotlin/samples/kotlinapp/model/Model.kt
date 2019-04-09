package com.kotlin.samples.kotlinapp.model

import java.io.Serializable

/**
 * @author : Eduardo Medina
 * @since : 11/17/18
 * @see : https://developer.android.com/index.html
 */

open class ViewType(){
    open fun isTypeA():Boolean=false
    open fun isTypeB():Boolean=false
    open fun isTypeC():Boolean=false
}

data class ViewTypeA(val id:Int?,val item:String?):ViewType(){
    override fun isTypeA(): Boolean =true
}

data class ViewTypeB(val id:Int?,val item:String?):ViewType(){
    override fun isTypeB(): Boolean=true
}

data class ViewTypeC(val id:Int?,val item:String?):ViewType(){
    override fun isTypeC(): Boolean=true
}