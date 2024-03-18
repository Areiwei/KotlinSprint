package org.example.lesson_7

fun main() {

    println("Введите число")
    val inputNumber = readln().toInt()

    for (i in 0..inputNumber step 2) {
        println(i)
        if (i == inputNumber || i == inputNumber - 1)
            break

    }
}
