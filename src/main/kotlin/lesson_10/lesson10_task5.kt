package org.example.lesson_10

fun main() {
    println("Введите логин")
    val inputLogin = readln()
    println("пароль")
    val inputPass = readln()
    val success = authorize(inputLogin, inputPass)
    showCart(success)
}

fun authorize(inputLogin: String?, inputPass: String?): String? {
    val login = ("nagibatorPWNZ")
    val pass = ("1q2w3e")
    val tokenNumbers = (0..9)
    val tokenWords = ('a'..'z')
    val token = (tokenNumbers + tokenWords).shuffled().joinToString("")
    if (inputLogin == login && inputPass == pass) {
        return println(token).toString()
    } else {
        println("Неудачная авторизация")
        return null
    }
}

fun showCart(token: String?): Unit? {
    val listOfCart = listOf("мята", "желуди", "свиные ребра", "дрель")
    if (token != null) {
        return println(listOfCart)
    } else {
        return null
    }
}




