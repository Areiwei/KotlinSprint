package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val numbers = Random
    val randomNumbers = List(3) { numbers.nextInt(43) }
    val inputNumbers = mutableListOf<Int>()
    println(randomNumbers)
    repeat(3) {
        println("Введите число от 0 до 42")
        val input = readln().toInt()
        inputNumbers.add(input)
    }
    val coincidence = randomNumbers.intersect(inputNumbers).size
    when (coincidence) {
        3 -> println("Вы выиграли джекпот")
        2 -> println("Вы выиграли крупный приз")
        1 -> println("Вы забираете утешительный приз")
        0 -> println("Увы, мимо! В следующий раз повезёт")
    }
    println(randomNumbers)
}
