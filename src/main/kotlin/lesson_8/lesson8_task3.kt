package org.example.lesson_8

fun main() {

    val ingredientsArray =
        arrayOf("петрушка", "арахис", "лук", "яйцо", "помидоры", "бекон", "соль", "говядина", "лапша")

    println("Введите искомый ингредиент")
    val request = readln()

    if (request in ingredientsArray) {
        println("Ингредиент $request в рецепте есть")
        return
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}