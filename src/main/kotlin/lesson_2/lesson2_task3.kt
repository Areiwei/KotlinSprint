package org.example.lesson_2

fun main() {
    val hourStart = 9
    val minuteStart = 39
    val fullTravelTime = 457

    val timeStart = hourStart * TIME + minuteStart
    val timeEnd = timeStart + fullTravelTime
    val hourEnd = timeEnd / TIME
    val minuteEnd = timeEnd % TIME

    println("$hourEnd:$minuteEnd")
}
const val TIME = 60
