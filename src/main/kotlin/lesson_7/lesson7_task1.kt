package org.example.lesson_7

fun main() {

    val range = 1..3
    var sum = "Ваш пароль: "

    for (i in range) {
        val rangePassNumbers = (1..9).random()
        val rangePassWords = ('a'..'z').random()
        sum += "$rangePassNumbers$rangePassWords"
    }

    println(sum)

}