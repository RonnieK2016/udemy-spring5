package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    private final RecipeService recipeService;

    public IndexPageController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());

        return "index";
    }
}
