package org.example.lesson_11

fun main() {

    val burger3Ingredients = arrayOf(
        Ingredient(1, "Творог", "350"),
        Ingredient(2, "Яйцо", "1"), Ingredient(3, "мука", "6"),
        Ingredient(4, "сахар", "2"), Ingredient(5, "мясо", "300")
    )
    val borschIngredients: Array<Ingredient> = arrayOf(
        Ingredient(6, "картофель", "3"),
        Ingredient(6, "свекла", "1"), Ingredient(7, "морковь", "1"),
        Ingredient(8, "соль", "2")
    )
    val peaIngredients: Array<Ingredient> = arrayOf(
        (Ingredient(6, "картофель", "3")),
        Ingredient(9, "горох", "15"), Ingredient(10, "ребрышки", "300")
    )

    val burgers = RecipeCategory(1, "Бургеры", "Рецепты всех популярных видов бургеров")
    val burger3 = Recipe("Бургер с грибами и сыром", 3, burger3Ingredients)
    val burger3Compound = Ingredient(12, "Куриное яйцо", "2")

    val soups = RecipeCategory(2, "Супы", "Рецепты вкусных супов")
    val borsch = Recipe("Борщ", 22, borschIngredients)
    val pea = Recipe("Гороховый", 23, peaIngredients)
    burgers.choiceCategory()
    burger3.choiceRecipe()
    burger3Compound.showInfo()
    soups.addRecipes(borsch)
    soups.addRecipes(pea)
}

class RecipeCategory(
    val categoryId: Int,
    val name: String,
    val about: String,
    val recipes: MutableList<Recipe> = mutableListOf()
) {
    fun choiceCategory() {
        println("Выбрана категория $name")
    }

    fun addRecipes(recipe: Recipe) {
        recipes.add(recipe)
    }
}

class Recipe(
    val recipeName: String,
    val recipeId: Int,
    val ingredients: Array<Ingredient>,
) {
    fun choiceRecipe() {
        println(recipeName)
    }
}

class Ingredient(
    val ingredientId: Int,
    val ingredientName: String,
    val ingredientAmount: String,
) {
    fun showInfo() {
        println("$ingredientName в количестве $ingredientAmount")
    }
}