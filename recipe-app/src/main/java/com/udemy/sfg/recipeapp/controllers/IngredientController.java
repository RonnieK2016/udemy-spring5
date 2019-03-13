package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.services.IngredientCommandService;
import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IngredientController {

    private final RecipeCommandService recipeCommandService;
    private final IngredientCommandService ingredientCommandService;

    public IngredientController(RecipeCommandService recipeCommandService, IngredientCommandService ingredientCommandService) {
        this.recipeCommandService = recipeCommandService;
        this.ingredientCommandService = ingredientCommandService;
    }

    @GetMapping
    @RequestMapping("recipe/{id}/ingredients")
    public String listIngredients(@PathVariable Long id, Model model) {

        model.addAttribute("recipe", recipeCommandService.findRecipeCommandById(id));

        return "recipe/ingredient/list";
    }

    @GetMapping
    @RequestMapping("recipe/{recipeId}/ingredient/{ingredientId}/show")
    public String viewIngredientById(@PathVariable Long recipeId,
                                     @PathVariable Long ingredientId,
                                     Model model) {

        model.addAttribute("ingredient",
                ingredientCommandService.findByRecipeIdAndIngredientId(recipeId, ingredientId));

        return "recipe/ingredient/show";
    }
}
