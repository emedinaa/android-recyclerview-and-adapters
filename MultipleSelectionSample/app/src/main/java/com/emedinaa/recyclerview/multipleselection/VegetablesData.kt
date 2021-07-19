package com.emedinaa.recyclerview.multipleselection

/**
 * @author Eduardo Medina
 */
object VegetablesData {

    fun vegetableList(): List<Vegetable> {
        val vegetables: MutableList<Vegetable> = arrayListOf()

        vegetables.add(Vegetable(1, "Potato", R.drawable.ic_potato))
        vegetables.add(Vegetable(2, "Avocado", R.drawable.ic_avocado))
        vegetables.add(Vegetable(3, "White Corn", 0))
        vegetables.add(Vegetable(4, "Purple Corn", 0))
        vegetables.add(Vegetable(5, "Cassava", 0))
        vegetables.add(Vegetable(6, "Mashua", 0))
        vegetables.add(Vegetable(7, "Ulluco", 0))
        vegetables.add(Vegetable(8, "Native South American Tuber", 0))
        vegetables.add(Vegetable(9, "Peruvian Root Vegetable", 0))
        vegetables.add(Vegetable(10, "Stuffing Cucumber", 0))
        vegetables.add(Vegetable(11, "Peruvian Ground Apple", 0))
        vegetables.add(Vegetable(12, "Asparagus", 0))
        vegetables.add(Vegetable(12, "Asparagus", 0))

        return vegetables
    }
}