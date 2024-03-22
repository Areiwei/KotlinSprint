package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("котлета", "сыр", "кетчуп")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить ещё?(да/нет)")
    val moreIngredients = readln()
    val yes1 = "да"
    if (moreIngredients.equals(yes1, ignoreCase = true)
    ) {
        println("Какой ингредиент вы хотите добавить?")
    } else {
        return
    }
    val newIngredient = readln()
    listOfIngredients.add(newIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}