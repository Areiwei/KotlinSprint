package org.example.lesson_6

fun main() {

    println("Введите требуемое количество секунд")
    val secondsList = mutableListOf<Int>()

    var input: Int = readln().toInt()
    secondsList.add(input)

    while (input > 0) {
        input--
        Thread.sleep(1000)
    }
    println("Прошло $secondsList секунд")
}