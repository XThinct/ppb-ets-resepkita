package com.example.resepkita.model

enum class RecipeCategory(val displayName: String) {
    MAKANAN("Makanan"),
    MINUMAN("Minuman")
}

data class Recipe(
    val id: Int,
    val name: String,
    val image: Int,
    val description: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val cookingTime: Int,
    val difficulty: String,
    val category: RecipeCategory
)