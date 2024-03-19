package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>("котлета", "сыр", "кетчуп")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить ещё?(да/нет)")
    val moreIngredients = readln()
    if
            (moreIngredients == "да") {
        println("Какой ингредиент вы хотите добавить?")
    } else {
        return
    }
   val newIngredient = readln()
    listOfIngredients.add(newIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}