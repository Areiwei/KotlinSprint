package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val pass = readln()
    if (validateLength(lengthLine = login) || validateLength(lengthLine = pass)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun validateLength(lengthLine: String): Boolean {
    return lengthLine.length < MINIMAL_SYMBOLS
}

const val MINIMAL_SYMBOLS = 4