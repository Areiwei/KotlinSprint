package org.example.lesson_11

fun main() {
    val burgers = RecipeCategory(1, "Бургеры", "Рецепты всех популярных видов бургеров")
    val burger3 = Burgers("Бургер с грибами и сыром")
    val burger3Compound = Ingredient(12, "Куриное яйцо", "2")
    burgers.choiceCategory()
    burger3.openBurger()
    burger3Compound.showInfo()
}

class RecipeCategory(
    val recipeId: Int?,
    val name: String,
    val about: String,
) {
    fun choiceCategory() {
        println("Выбрана категория $name")
    }
}

class Burgers(
    val burgerName: String,
) {
    fun openBurger() {
        println(burgerName)
    }
}

class Ingredient(
    val ingredientId: Int?,
    val ingredientName: String,
    val ingredientAmount: String,
) {
    fun showInfo() {
        println("$ingredientName в количестве $ingredientAmount")
    }
}
