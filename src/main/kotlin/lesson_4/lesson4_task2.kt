package org.example.lesson_4

fun main() {
    val cargoWeight1 = 20
    val cargoCapacity1 = 80
    val cargoWeight2 = 50
    val cargoCapacity2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoCapacity1 соотвествует категории" +
            " 'Average':" +
                   "${(cargoWeight1 >= MIN_WEIGHT)
                    && (cargoWeight1 <= MAX_WEIGHT)
                    && (cargoCapacity1 < CAPACITY)}")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoCapacity2 соотвествует категории " +
            "'Average':" +
                    "${(cargoWeight2 >= MIN_WEIGHT) 
                    && (cargoWeight2 <= MAX_WEIGHT)
                    && (cargoCapacity2 < CAPACITY)}")
}
const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val CAPACITY = 100