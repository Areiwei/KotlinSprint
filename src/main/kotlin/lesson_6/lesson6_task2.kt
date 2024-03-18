package org.example.lesson_6

fun main() {

    println("Введите требуемое количество секунд")

    var input: Int = readln().toInt()
    Thread.sleep(input * 1000L)

    println("Прошло $input секунд")
}