package com.udemy.sfg.recipeapp.services.impl;

import com.udemy.sfg.recipeapp.commands.IngredientCommand;
import com.udemy.sfg.recipeapp.converters.IngredientToIngredientCommand;
import com.udemy.sfg.recipeapp.domain.Ingredient;
import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.services.IngredientCommandService;
import com.udemy.sfg.recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IngredientCommandServiceImpl implements IngredientCommandService {

    private final IngredientToIngredientCommand ingredientToIngredientCommand;
    private final RecipeService recipeService;

    public IngredientCommandServiceImpl(IngredientToIngredientCommand ingredientToIngredientCommand
            , RecipeService recipeService) {
        this.ingredientToIngredientCommand = ingredientToIngredientCommand;
        this.recipeService = recipeService;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        Recipe recipe = recipeService.getById(recipeId);

        if(recipe == null) {
            log.warn("Recipe is not found by id {} ", recipeId);
            return null;
        }

        Ingredient ingredient = recipe.getIngredients().stream()
                .filter( in -> ingredientId.equals(in.getId()))
                .findFirst()
                .orElse(null);
        if(ingredient == null) {
            log.warn("Ingredient is not found by id {} ", ingredientId);
            return null;
        }

        return ingredientToIngredientCommand.convert(ingredient);
    }
}
