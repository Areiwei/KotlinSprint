package org.example.lesson_2

fun main(){
    val workers = 50
    val workersWages = 30000
    val intern = 30
    val internWages = 20000
    val sumWorkersWages = workers * workersWages
    val sumInternWages = intern * internWages
    val sumWages = (sumWorkersWages + sumInternWages)
    val averageWages = sumWages / (workers + intern)
    println(sumWorkersWages)
    println(sumWages)
    println(averageWages)
}
