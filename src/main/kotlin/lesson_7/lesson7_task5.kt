package org.example.lesson_7

fun main() {
    var inputRange: Int
    do {
        println("Введите длину желаемого пароля(не менее 6 символов): ")
        inputRange = readln().toInt()
        if (inputRange < MINIMUM_CHARACTERS) {
            println("Минимальная длина желаемого пароля - 6 символов.")
        }
    } while (inputRange < MINIMUM_CHARACTERS)


    val rangePassNumbers = 1..9
    val rangePassWords = ('a'..'z')
    val rangePassCapWords = ('A'..'Z')

    var listOfSymbols = (rangePassWords.toList() + rangePassNumbers.toList() + rangePassCapWords.toList())
    val shuffledSymbols = listOfSymbols.shuffled().joinToString("")
    val generatedPassword = shuffledSymbols.substring(0, inputRange)

    println("Ваш пароль: $generatedPassword")
}

const val MINIMUM_CHARACTERS = 6
