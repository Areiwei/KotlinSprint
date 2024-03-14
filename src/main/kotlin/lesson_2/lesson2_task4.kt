package org.example.lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    var buffMidas = 20

    val buffCrystal = (crystalOre.toFloat() / percentage) * buffMidas
    val buffIron = (ironOre.toFloat() / percentage) * buffMidas
    println("Bonus Crystal Ore = ${buffCrystal.toInt()}")
    println("Bonus Iron Ore = ${buffIron.toInt()}")
}
const val percentage = 100