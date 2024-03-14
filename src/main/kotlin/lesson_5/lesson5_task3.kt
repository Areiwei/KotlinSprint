package org.example.lesson_5

fun main() {
    val luckyNumber1 = 38
    val luckyNumber2 = 39
    println("Хэхэй! Поучаствуйте в лотерее, последовательно введите 2 верных числа" +
            " от 0 до 42 и получите приз!")
    val input1 = readln().toInt()
    val input2 = readln().toInt()


   val result = if ((input1 == luckyNumber1 && input2 == luckyNumber2)
                || (input1 == luckyNumber2 && input2 == luckyNumber1)) "Поздравляем!" +
           " Вы выиграли главный приз!"
    else if ((input1 == luckyNumber1 || input1 == luckyNumber2 || input2 == luckyNumber2
                || input1 == luckyNumber1)) "Вы выиграли утешительный приз!"
    else "Неудача!"
    println("Выигрышные числа $luckyNumber1 и $luckyNumber2 ")

    println(result)


}
