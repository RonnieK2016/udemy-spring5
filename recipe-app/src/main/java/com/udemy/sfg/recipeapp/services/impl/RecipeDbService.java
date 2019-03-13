package com.udemy.sfg.recipeapp.services.impl;

import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.repositories.RecipeRepository;
import com.udemy.sfg.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
public class RecipeDbService implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeDbService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipes() {
        HashSet<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().forEach(recipes::add);

        log.debug("Getting all recipes {} ", recipes.size());

        return recipes;
    }

    @Override
    public Recipe getById(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        if(!recipe.isPresent()) {
            throw new RuntimeException("Recipe is not found by ID " + id);
        }

        return recipe.get();
    }
}
