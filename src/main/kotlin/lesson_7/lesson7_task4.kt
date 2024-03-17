package org.example.lesson_7

fun main() {
    println("Сколько секунд требуется засечь?")
    var inputSec = readln().toInt()
    val end = 0

    for (i in inputSec downTo end) {
        println("Осталось ${inputSec--} секунд ")
        Thread.sleep(1000)
    }
    println("Время вышло")

}