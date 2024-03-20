package org.example.lesson_8

fun main() {

    println("Сколько ингредиентов планируется ввести?")
    val countOfIngredients = readln().toInt()

    val ingredientsArray = arrayOfNulls<String>(countOfIngredients)
    var currentIndex = 0

    println("Введите по очереди наименование ингредиентов")
    repeat(countOfIngredients) {
        val inputIngredients = readln()
        ingredientsArray[(currentIndex)] = inputIngredients
        currentIndex++
    }
    println(ingredientsArray.joinToString())

}