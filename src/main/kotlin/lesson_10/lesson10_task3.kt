package org.example.lesson_10

fun main() {
    println("Введите длину желаемого пароля")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))

}

fun generatePassword(passwordLength: Int): String {
    val symbolsRange = ('\u0021'..'\u002F').shuffled()
    val numbers = (0..9).toList().shuffled()
    val passwords = symbolsRange.zip(numbers).flatMap { (s, n) -> listOf(s, n) }.joinToString("")
    return passwords.substring(0, passwordLength)
}