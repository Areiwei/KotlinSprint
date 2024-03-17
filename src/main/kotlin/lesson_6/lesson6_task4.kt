package org.example.lesson_6

import kotlin.random.Random

fun main() {

    val rndNumber = (1..9).random()

    println("Угадайте загадонное число от 1 до 9. У вас есть 5 попыток!")

    var attempt = 5

    do {
        var userNumber = readln().toInt()

        if (rndNumber == userNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно, осталось ${--attempt} попыток")
        }
    } while (attempt > 0)

    println("Было загадано число $rndNumber")

}




