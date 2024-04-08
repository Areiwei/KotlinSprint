package org.example.lesson_11

fun main() {
    val burgers = RecipeCategory(1, "Бургеры", "Рецепты всех популярных видов бургеров")
    val burger3 = Recipe("Бургер с грибами и сыром", 3, "Творог, куриное яйцо, мука, сахар, мясо")
    val burger3Compound = Ingredient(12, "Куриное яйцо", "2")

    val soups = RecipeCategory(2, "Супы", "Рецепты вкусных супов")
    val borsch = Recipe("Борщ", 22, "Картофель, свекла, капуста, морковь, зелень, соль")
    val pea = Recipe("Гороховый", 23, "Картофель, горох, лук, морковь, ребрышки, соль")
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
    val ingredients: String,
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
