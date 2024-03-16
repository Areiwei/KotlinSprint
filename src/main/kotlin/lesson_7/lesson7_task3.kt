package org.example.lesson_7

fun main() {

    println("Введите число")
    val inputNumber = readln().toInt()
    val number = inputNumber

    val numbRange = 0..2147483647 step 2

    for (i in numbRange) {
        println(i)
        if (i == number || i == number - 1)
            break

    }
}
