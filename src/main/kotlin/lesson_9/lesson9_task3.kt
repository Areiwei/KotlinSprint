package org.example.lesson_9

fun main() {
    val omeletteIngredients = listOf(2, 50, 15)
    println("Сколько порций требуется?")
    val countPortion = readln().toInt()
    val omeletteIngredientsCount = omeletteIngredients.map { it * countPortion }
    println(omeletteIngredientsCount)
}
