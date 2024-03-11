package org.example.lesson_4

fun main() {
    var tablesToday = 13
    var tablesTomorrow = 9

    val resultToday = (TABLES > tablesToday)
    val resultTomorrow = (TABLES > tablesTomorrow)
    println("Доступность столиков на сегодня: $resultToday\nДоступность столиков на завтра: $resultTomorrow")
}
const val TABLES = 13
