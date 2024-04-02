package org.example.lesson_11

fun main() {
    val user1 = User(1, "nagibator", "1q2w3e", "nagibator2000@mail.ru")
    val user2 = User(2, "Sony", "xcxc12", "ericsson@mail.ru")
    println("id: ${user1.id}, login: ${user1.login}, pass: ${user1.pass}, mail: ${user1.mail}")
    println("id: ${user2.id}, login: ${user2.login}, pass: ${user2.pass}, mail: ${user2.mail}")
}

class User(
    val id: Int,
    val login: String,
    val pass: String,
    val mail: String,
)