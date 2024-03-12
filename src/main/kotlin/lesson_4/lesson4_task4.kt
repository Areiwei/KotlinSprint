package org.example.lesson_4

fun main() {
    var day = 5
    val isTrainDay = day % 2 == 0

    println("""
        |Упражнение для рук:    ${!isTrainDay}
        |Упражнение для ног:    $isTrainDay
        |Упражнение для спины:  $isTrainDay
        |Упражнение для пресса: ${!isTrainDay}
    """.trimIndent())
}
