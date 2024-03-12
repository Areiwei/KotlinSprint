package org.example.lesson_5

fun main() {
    val a = (0..100).random()
    val b = (0..100).random()
    println("Решите пример: $a + $b = ?")
    val example = readln().toInt()

    val resultText = if (example == (a + b)) "Добро пожаловать!"
    else "Доступ запрещен."
    println(resultText)
}