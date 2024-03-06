package org.example.lesson_1

fun main(){
    val seconds: Short = 6480
    val minutes: Int = seconds / 60
    val remSeconds = seconds % 60
    val hours: Int = minutes / 60
    val remMinutes = minutes % 60
    val formSeconds = String.format("%02d", remSeconds)
    val formMinutes = String.format("%02d", remMinutes)
    val formHours = String.format("%02d", hours)
println("$formHours:$formMinutes:$formSeconds")
}