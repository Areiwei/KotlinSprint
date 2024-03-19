package org.example.lesson_9

fun main() {
    val ingredientsList = listOf("творог", "мука", "яйца", "масло", "изюм", "сахар")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach {
        println(it)
    }
}