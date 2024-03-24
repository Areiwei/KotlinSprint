package org.example.lesson_10

fun main() {

    generatePassword()
}

fun generatePassword() {
    val symbols = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ').shuffled()
    val numbers = (0..9).toList().shuffled()
    val password = symbols.zip(numbers).flatMap { (s, n) -> listOf(s, n) }.joinToString("")
    println("Введите длину желаемого пароля")
    val passwordLength = readln().toInt()
    return println(password.substring(0, passwordLength))
}