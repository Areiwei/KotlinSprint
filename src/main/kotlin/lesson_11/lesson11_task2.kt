package org.example.lesson_11

fun main() {
    val oleg = User2(13, "nagibator", "aloha", "baby1998@mail.ru")
    writeBio(oleg)
    changePassword(oleg)
    println(showInformation(oleg))

}

fun writeBio(user: User2) {
    println("Расскажите о себе")
    val inputBio = readln()
    user.bio = inputBio
}

fun showInformation(user: User2): String {
    return "id: ${user.id}, login: ${user.login}, pass: ${user.pass}, mail: ${user.mail}, ${user.bio}"
}

fun changePassword(user: User2): String {
    println("Для смены пароля введите текущий пароль")
    val checkPass = readln()
    if (checkPass == user.pass) {
        println("Введите новый пароль")
        user.pass = readln()
    } else {
        println("Неверный пароль")
    }
    return user.pass
}

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String? = null,
)