package org.example.lesson_6

fun main() {

    var countAttempts = 3
    do {
        val antiBotNumb1 = (1..9).random()
        val antiBotNumb2 = (1..9).random()
        val antiBot = antiBotNumb1 + antiBotNumb2
        println(
            "Вы не робот? Решите математический пример" +
                    " $antiBotNumb1 + $antiBotNumb2 = "
        )
        val entryField = readln().toInt()
        if (antiBot == entryField) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно, у вас осталось ${--countAttempts} попыток")
        }

    } while (countAttempts > 0)
    println("Доступ запрещен.")
}