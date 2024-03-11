package org.example.lesson_5

fun main() {
    val antiBot = 1337
    println("Решите пример: 1300 + 37 =?")
    val example = readLine()?.toInt()

    val resultText = if (example == antiBot) "Добро пожаловать!"
    else "Доступ запрещен."
    println(resultText)
}