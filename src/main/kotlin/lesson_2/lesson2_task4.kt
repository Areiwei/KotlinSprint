package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffCrystal = (crystalOre.toFloat() / percentage) * buffMidas
    val buffCrystalDrop = crystalOre + buffCrystal.toInt()

    val buffIron = (ironOre.toFloat() / percentage) * buffMidas
    val buffIronDrop = ironOre + buffIron.toInt()

    println("Bonus Crystal Ore = ${buffCrystal.toInt()}")
    println("Bonus Iron Ore = ${buffIron.toInt()}")
}
const val buffMidas = 20
const val percentage = 100