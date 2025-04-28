package com.example.resepkita.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.resepkita.model.Recipe
import com.example.resepkita.model.RecipeCategory
import com.example.resepkita.repository.RecipeRepository

class RecipeViewModel : ViewModel() {
    private val repository = RecipeRepository()
    private val allRecipes = repository.getAllRecipes()

    private val _favoriteIds = mutableStateListOf<Int>()
    val favoriteRecipes: List<Recipe>
        get() = allRecipes.filter { _favoriteIds.contains(it.id) }

    var searchQuery by mutableStateOf("")
        private set

    var isShowingFavorites by mutableStateOf(false)
        private set

    var selectedRecipe by mutableStateOf<Recipe?>(null)
        private set

    var selectedCategory by mutableStateOf<RecipeCategory?>(null)
        private set

    val currentPageRecipes: List<Recipe>
        get() {
            val recipesToFilter = if (isShowingFavorites) favoriteRecipes else allRecipes

            val filteredByCategory = if (selectedCategory != null) {
                recipesToFilter.filter { it.category == selectedCategory }
            } else {
                recipesToFilter
            }

            return if (searchQuery.isNotBlank()) {
                repository.searchRecipes(searchQuery, filteredByCategory)
            } else {
                filteredByCategory
            }
        }

    fun searchRecipes(query: String) {
        searchQuery = query
    }

    fun showAllRecipes() {
        isShowingFavorites = false
    }

    fun showFavorites() {
        isShowingFavorites = true
    }

    fun selectRecipe(recipe: Recipe) {
        selectedRecipe = recipe
    }

    fun clearSelectedRecipe() {
        selectedRecipe = null
    }

    fun toggleFavorite(recipeId: Int) {
        if (_favoriteIds.contains(recipeId)) {
            _favoriteIds.remove(recipeId)
        } else {
            _favoriteIds.add(recipeId)
        }
    }

    fun isFavorite(recipeId: Int): Boolean {
        return _favoriteIds.contains(recipeId)
    }

    fun selectCategory(category: RecipeCategory?) {
        selectedCategory = category
    }
}