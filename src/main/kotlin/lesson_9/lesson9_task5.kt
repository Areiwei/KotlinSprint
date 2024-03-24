package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableSetOf<String>()
    println("Введите пять ингредиентов (каждый по отдельности).")
    repeat(5) {
        val inputIngredients = readln().lowercase()
        listOfIngredients.add(inputIngredients)
    }

    val orderedListOfIngredients = listOfIngredients.sorted().toMutableList()
    orderedListOfIngredients[0] = orderedListOfIngredients[0].replaceFirstChar { it.titlecase() }
    val result = orderedListOfIngredients.joinToString(", ")
    println(result)
}
