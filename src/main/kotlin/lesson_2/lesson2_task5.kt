package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depAmount: Int = 70_000
    val rate: Double = 16.7
    val depTime: Int = 20

    val exhaust = depAmount * (1 + (rate / PERCENTAGE)).pow(depTime.toDouble())
    println("%.3f".format(exhaust))
}
const val PERCENTAGE = 100