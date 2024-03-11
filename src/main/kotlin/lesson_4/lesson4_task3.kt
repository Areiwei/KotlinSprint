package org.example.lesson_4

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val curHumidity: Int = 20
    val curSeason: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(IS_SUNNY == isSunny) 
            && (IS_AWNING_OPEN == isAwningOpen)
            && (HUMIDITY == curHumidity)
            && (BAD_SEASON != curSeason)}")
}
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val BAD_SEASON = "Зима"
