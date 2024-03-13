package org.example.lesson_4

fun main() {
    println("Имеются ли повреждения корпуса?")
    val isDamaged: Boolean = readln().toBoolean()
    println("Введите количественный состав экипажа?")
    val crew = readln().toInt()
    println("Введите количество ящиков с провизей на борту")
    val provisions = readln().toInt()
    println("Благоприятная ли погода?")
    val isFavorableConditions: Boolean = readln().toBoolean()

    val result = (isDamaged == IS_DAMAGED)
            && (crew in MINIMUM_CREW..MAXIMUM_CREW)
            && (provisions >= PROVISIONS)
            && (isFavorableConditions == (IS_FAVORABLE_CONDITIONS or !IS_FAVORABLE_CONDITIONS))
            || (crew == MAXIMUM_CREW)
            && (provisions >= PROVISIONS)
            && (isFavorableConditions == IS_FAVORABLE_CONDITIONS)
    println(result)
}

const val IS_DAMAGED = false
const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val PROVISIONS = 50
const val IS_FAVORABLE_CONDITIONS = true

