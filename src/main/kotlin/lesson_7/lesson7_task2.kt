package org.example.lesson_7

fun main() {
    var rndSms = (1000..9999).random()
    println("Ваш код авторизации: $rndSms")

    do {
        val inputSms: Int = readln().toInt()
        if (rndSms == inputSms) {
            println("Добро пожаловать!")
        } else {
            rndSms = (1000..9999).random()
            println("Неверный код, ваш новый код $rndSms")
        }
    } while (rndSms != inputSms)

}
