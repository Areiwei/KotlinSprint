package org.example.lesson_8

fun main() {

    var arrayOfIngredients = arrayOf("говядина", "вино", "соль", "специи", "масло")
    println(arrayOfIngredients.joinToString())

    do {
        println("Какой ингредиент вы хотите заменить?")
        val basedIngredient = readln()

        if (basedIngredient in arrayOfIngredients) {

            println("Какой ингредиент вы хотели бы добавить?")
            val userIngredient = readln()

            val index = arrayOfIngredients.indexOf(basedIngredient)
            arrayOfIngredients[index] = userIngredient
            println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}.")
            return
        } else {
            println("Такого ингредиента нет.")
        }
    } while (basedIngredient !in arrayOfIngredients)


}