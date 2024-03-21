package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>()
    println("Введите пять ингредиентов (каждый по отдельности).")
    repeat(5) {
        val inputIngredients = readln()
        listOfIngredients.add(inputIngredients)
    }

    val orderedListOfIngredients = listOfIngredients.distinct().sorted()
    val result = orderedListOfIngredients.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.capitalize() else ingredient
    }.joinToString(", ")
    println(result)
}

