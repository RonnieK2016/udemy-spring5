package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IngredientController {

    private final RecipeCommandService recipeCommandService;

    public IngredientController(RecipeCommandService recipeCommandService) {
        this.recipeCommandService = recipeCommandService;
    }

    @GetMapping
    @RequestMapping("recipe/{id}/ingredients")
    public String listIngredients(@PathVariable Long id, Model model) {

        model.addAttribute("recipe", recipeCommandService.findRecipeCommandById(id));

        return "recipe/ingredient/list";
    }
}
