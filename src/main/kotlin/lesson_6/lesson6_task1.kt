package org.example.lesson_6


fun main() {

    val greetings = "Для регистрации придумайте логин и пароль."
    val msgLogin = "Введите логин"
    val msgPass = "Введите пароль"

    println(greetings)
    println(msgLogin)
    val regLogin = readln()
    println(msgPass)
    val regPass = readln()
    println("Ваш аккаунт зарегистрирован!")

    do {
        println(msgLogin)
        val inputLogin = readln()
        println(msgPass)
        val inputPass: String = readln()
        if (inputLogin == regLogin && inputPass == regPass) {
            break
        } else {
            println("Неверный логин или пароль, попробуйте заново")
        }
    } while (inputLogin != regLogin || inputPass != regPass)
    println("Авторизация прошла успешно")
}
