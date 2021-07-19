package com.emedinaa.recyclerview.itemstate

/**
 * @author Eduardo Medina
 */
object VegetablesData {

    fun vegetableList(): List<Vegetable> {
        val vegetables: MutableList<Vegetable> = arrayListOf()

        vegetables.add(Vegetable(1, "Potato", 0,20))
        vegetables.add(Vegetable(2, "Avocado", 0,50))
        vegetables.add(Vegetable(3, "White Corn", 0,10))
        vegetables.add(Vegetable(4, "Purple Corn", 0,30))
        vegetables.add(Vegetable(5, "Cassava", 0,90))
        vegetables.add(Vegetable(6, "Mashua", 0,70))
        vegetables.add(Vegetable(7, "Ulluco", 0,80))
        vegetables.add(Vegetable(8, "Native South American Tuber", 0,75))
        vegetables.add(Vegetable(9, "Peruvian Root Vegetable", 0,60))
        vegetables.add(Vegetable(10, "Stuffing Cucumber", 0,30))
        vegetables.add(Vegetable(11, "Peruvian Ground Apple", 0,40))
        vegetables.add(Vegetable(12, "Asparagus", 0,50))
        vegetables.add(Vegetable(12, "Asparagus", 0,100))

        return vegetables
    }
}