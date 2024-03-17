package org.example.lesson_8

fun main() {

    val ingredientsArray =
        arrayOf("петрушка", "арахис", "лук", "яйцо", "помидоры", "бекон", "соль", "говядина", "лапша")

    println("Введите искомый ингредиент")
    var request = readln()
    for (i in ingredientsArray) {
        if (i == request) {
            println("Ингредиент $request в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}