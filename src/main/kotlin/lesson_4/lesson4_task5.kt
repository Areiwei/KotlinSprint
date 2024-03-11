package org.example.lesson_4

fun main() {
    println("Имеются ли повреждения корпуса? Да/Нет")
    val isDamaged = readLine()
    println("Введите количественный состав экипажа?")
    val crew = readLine()?.toInt()
    println("Введите количество ящиков с провизей на борту")
    val provisions = readLine()?.toInt()
    println("Благоприятная ли погода? Благоприятная/Неблагоприятная")
    val isFavorableConditions = readLine()

    val result = (isDamaged == IS_DAMAGED)
            && (crew in MINIMUM_CREW..MAXIMUM_CREW)
            && (provisions!! >= PROVISIONS)
            || (crew == MAXIMUM_CREW)
            && (provisions!! >= PROVISIONS)
            && (isFavorableConditions == IS_FAVORABLE_CONDITIONS)
    println(result)
}
const val IS_DAMAGED = "Нет"
const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val PROVISIONS = 50
const val IS_FAVORABLE_CONDITIONS = "Благоприятная"
