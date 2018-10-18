package pl.ciemic.spring5recipeapp.services;

import pl.ciemic.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
