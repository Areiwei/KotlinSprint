package org.example.lesson_4

fun main() {
    var tablesToday = 0
    var tablesTomorrow = 4

    val resultToday = (1 <= tablesToday)
    val resultTomorrow = (1 <= tablesTomorrow)
    println("Доступность столиков на сегодня:$resultToday\nДоступность столиков на завтра:$resultTomorrow")
}
