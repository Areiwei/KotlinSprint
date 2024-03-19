package org.example.lesson_9

fun main() {
    val omeletteIngredients = listOf(2, 50, 15)
    println("Сколько порций требуется?")
    val countPortion = readln().toInt()
    println(
        "На $countPortion порций вам понадобится: яиц ${countPortion * omeletteIngredients[0]} шт.," +
                " молока ${countPortion * omeletteIngredients[1]} мл.," +
                " сливочного масла ${countPortion * omeletteIngredients[2]} гр."
    )
}