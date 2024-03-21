package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val pass = readln()


    if (setMinimumLength(login, pass)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun setMinimumLength(login: String, pass: String) : Boolean {
    val minLength = 4
    return login.length < minLength || pass.length < minLength
}
