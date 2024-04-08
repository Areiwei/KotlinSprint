package org.example.lesson_11

fun main() {
    val user1 = Member(avatar = "slon.png", nickname = "Bimbo", status = "Разговаривает")
    val user2 = Member(avatar = "star.png", nickname = "Povelitel", status = "Микрофон выключен")
    val user3 = Member(avatar = "flowers.png", nickname = "Dasha", status = "Пользователь заглушен")
    val user4 = Member(avatar = "zombies.png", nickname = "RAMMSTEIN", status = "Микрофон выключен")
    val user5 = Member(avatar = "cocojambo.png", nickname = "dReamer", status = "Разговаривает")

    val room1 = Room("logo.png", "Бантики", mutableListOf(user1, user2, user3))
    room1.scrollDown()
    room1.showGroup()
    room1.showRoomAvatars()
    room1.longTap(user1)
    room1.newStatus("Bimbo", "Микрофон включен")

    val room2 = Room("winter.png", "Конфетки", mutableListOf(user4, user5))
    room2.scrollUp()
    room2.showGroup()
    room2.addInRoom(user3)
    room2.newStatus("Dasha", "Разговаривает")
    room2.longTap(user3)
    room2.newStatus("RAMMSTEIN", "Разговаривает")
    room2.newStatus("dReamer", "Микрофон выключен")
    room2.showMemberList()
}

class Member(
    var avatar: String,
    var nickname: String,
    var status: String,
)

class Room(
    var cover: String,
    var title: String,
    var memberList: MutableList<Member>,
) {
    fun scrollDown() {
        println("Листаем вниз")
    }

    fun scrollUp() {
        println("Листаем вверх")
    }

    fun longTap(user: Member) {
        println("Лонг тап по аватару ${user.avatar}")
        highlight(user.nickname)
        println("Аватар: ${user.avatar}, Имя: ${user.nickname}, Статус: ${user.status}")
    }

    fun highlight(user: String) {
        println("Подсвечивает никнейм $user")
    }

    fun addInRoom(user: Member) {
        memberList.add(user)
        println("Пользователь ${user.nickname} добавлен в комнату")
    }

    fun newStatus(user: String, status: String) {
        memberList.find { it.nickname == user }?.status = status
    }

    fun showGroup() {
        println("Обложка: $cover, Имя: $title")
    }

    fun showMemberList() {
        println("Список участников комнаты")
        memberList.forEach { member -> println("Аватар: ${member.avatar}, Ник: ${member.nickname}, Статус: ${member.status}") }
    }

    fun showRoomAvatars() {
        println("Список аватарок пользователей")
        memberList.forEach { member -> println("Аватар: ${member.avatar}") }
    }
}