package org.example.lesson_3

fun main() {
    val result = "D2-D4;0"
    val (from, to, move) = result.split("-", ";")
    println(from)
    println(to)
    println(move)
}