package org.example.lesson_10

fun main() {
    println("Введите логин")
    val inputLogin = readln()
    println("пароль")
    val inputPass = readln()
    val success = authorize(inputLogin, inputPass)
    if (authorize(inputLogin, inputPass) == null) println("Неудачная авторизация")
    println(showCart(success))
}

fun generateToken(): String {
    val chars = ('A'..'Z') + (0..9) + ('a'..'z')
    return (0..31).map { chars.random() }.joinToString("")
}

fun authorize(inputLogin: String?, inputPass: String?): String? {
    return if (inputLogin == ("nagibatorPWNZ") && inputPass == "1q2w3e") {
        generateToken()
    } else {
        null
    }
}

fun showCart(token: String?): List<String>? {
    val listOfCart = listOf("мята", "желуди", "свиные ребра", "дрель")
    return if (token != null) {
        listOfCart
    } else {
        null
    }
}