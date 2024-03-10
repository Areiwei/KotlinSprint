package org.example.lesson_4

fun main() {
    var day = 5
    val trainDay = day % 2 == 0

    val armsPress = !trainDay
    val legsShoulders = trainDay

    println("""
        |Упражнение для рук:    $armsPress
        |Упражнение для ног:    $legsShoulders
        |Упражнение для спины:  $legsShoulders
        |Упражнение для пресса: $armsPress
    """.trimIndent())
}
