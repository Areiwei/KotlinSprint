package org.example.lesson_6


fun main() {

    val login: MutableList<String> = mutableListOf()
    val pass: MutableList<String> = mutableListOf()

    val greetings = "Для регистрации придумайте логин и пароль."
    val msgLogin = "Введите логин"
    val msgPass = "Введите пароль"

    println(msgLogin)
    val regLogin = readln()
    login.add(regLogin)
    println(msgPass)
    val regPass = readln()
    pass.add(regPass)
    println("Ваш аккаунт зарегистрирован!")

    do {
        println(msgLogin)
        val inputLogin = readln()
        println(msgPass)
        val inputPass: String = readln()
        if (inputLogin == regLogin && inputPass == regPass) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверный логин или пароль, попробуйте заново")
        }
    } while (true)

}
