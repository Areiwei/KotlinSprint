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
    var computerWins = 0
    var humanWins = 0
    do {
        println("Компьютер бросает кость")
        val computerThrow = generateNumbers()
        Thread.sleep(1000)
        println("Выпавшее число компьютера $computerThrow")
        Thread.sleep(1000)

        println("Вы бросаете кость")
        val playerThrow = generateNumbers()
        Thread.sleep(1000)
        println("Выпавшее число игрока $playerThrow")


        when {
            computerThrow > playerThrow -> {
                computerWins++
                println("Компьютер победил")
            }
            computerThrow == playerThrow -> println("Ничья")
            else -> {
                humanWins++
               println("Вы победили")
            }
        }
    } while (playRound())
    println("Игра окончена. Количество ваших побед $humanWins, количество побед компьютера $computerWins.")

}


fun generateNumbers() = (1..6).random()

fun playRound(): Boolean {
    println("Хотите продолжить(Да/Нет?)")
    val userInput = readln()
    return (userInput.equals("да", ignoreCase = true))
}