package org.example.lesson_10

fun main() {
    println(
        """
        Игра - бросок кости.
        Первым бросок делает компьютер, далее игрок.
        Игра началась!
    """.trimIndent()
    )
    Thread.sleep(1000)
    println("Компьютер бросает кость")
    val computerThrow = generateNumber()
    Thread.sleep(1000)
    println("Выпавшее число компьютера $computerThrow")
    Thread.sleep(1000)

    println("Вы бросаете кость")
    val playerThrow = generateNumber()
    Thread.sleep(1000)
    println("Выпавшее число игрока $playerThrow")

    if (computerThrow > playerThrow) {
        println("Компьютер победил")
    } else if (computerThrow == playerThrow) println("Ничья")
    else println("Вы победили")
}

fun generateNumber(): Int = (1..6).random()







