package org.example.lesson_6

import kotlin.random.Random

fun main() {

    val number = Random
    val rndNumber = List(1) { number.nextInt(10) }
    println(rndNumber)
    println("Угадайте загадонное число от 1 до 9. У вас есть 5 попыток!")

    var attempt = 5

    do {
        var userNumber = readln().toInt()

        if (rndNumber[0] == userNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно, осталось ${--attempt} попыток")
        }
    } while (attempt > 0)

    if (attempt <= 0) println("Было загадано число ${rndNumber[0]}")

}




