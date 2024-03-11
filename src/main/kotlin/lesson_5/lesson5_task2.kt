package org.example.lesson_5

fun main() {
    println("Введите год рождения")
    val yearBorn = readLine()!!.toInt()

    val resultText = if ((CURRENT_YEAR - yearBorn) >= MIN_AGE) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"
    println(resultText)
}

const val MIN_AGE = 18
const val CURRENT_YEAR = 2024