package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf<String>()
    println("Перечислите 5 ингредиентов, через запятую, которые требуется добавить")
    val addIngredients = readln()
    listOfIngredients.addAll(addIngredients.split(", ") ?: emptyList())

    val sortListOfIngredients = listOfIngredients.sorted()
    println(sortListOfIngredients)
}