package org.example.lesson_2

fun main(){
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5

    val mediumGrade:Double = (grade1 + grade2 + grade3 + grade4) / 4.0
    val formMediumGrade = String.format("%.2f", mediumGrade)
    println(formMediumGrade)
}
