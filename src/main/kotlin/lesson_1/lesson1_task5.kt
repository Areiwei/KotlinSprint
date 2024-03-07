package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val minutes: Int = seconds / TIME
    val remSeconds = seconds % TIME
    val hours: Int = minutes / TIME
    val remMinutes = minutes % TIME
    val formSeconds = String.format("%02d", remSeconds)
    val formMinutes = String.format("%02d", remMinutes)
    val formHours = String.format("%02d", hours)
    println("$formHours:$formMinutes:$formSeconds")
}
const val TIME = 60