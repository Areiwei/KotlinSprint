package org.example.lesson_4

fun main() {
    val curWeather: Boolean = true
    val curTent: Boolean = true
    val curHumidity: Int = 20
    val curSeason: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(WEATHER == curWeather) && (TENT == curTent) && (HUMIDITY == curHumidity) && (curSeason != "Зима")}")
}
const val WEATHER = true
const val TENT = true
const val HUMIDITY = 20

