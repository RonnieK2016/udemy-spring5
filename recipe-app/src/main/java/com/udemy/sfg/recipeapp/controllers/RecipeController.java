package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.commands.RecipeCommand;
import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import com.udemy.sfg.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {

    private RecipeService recipeService;
    private RecipeCommandService recipeCommandService;

    public RecipeController(RecipeService recipeService, RecipeCommandService recipeCommandService) {
        this.recipeService = recipeService;
        this.recipeCommandService = recipeCommandService;
    }

    @GetMapping
    @RequestMapping("/recipe/{id}/show")
    public String showRecipe(@PathVariable Long id,
            Model model) {
        Recipe recipe = recipeService.getById(id);
        model.addAttribute("recipe", recipe);
        return "recipe/show_recipe";
    }

    @GetMapping
    @RequestMapping("recipe/new")
    public String showRecipeForm(Model model) {
        model.addAttribute("recipe", new RecipeCommand());
        return "recipe/recipeform";
    }

    @GetMapping
    @RequestMapping("recipe/{id}/update")
    public String updateRecipeForm(@PathVariable Long id, Model model) {

        model.addAttribute("recipe", recipeCommandService.findRecipeCommandById(id));

        return "recipe/recipeform";
    }

    @GetMapping
    @RequestMapping("recipe/{id}/delete")
    public String deleteRecipe(@PathVariable Long id) {
        recipeService.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("recipe")
    public String addOrUpdateRecipe(@ModelAttribute RecipeCommand recipeCommand) {
        RecipeCommand savedCommand = recipeCommandService.saveRecipeCommand(recipeCommand);
        return "redirect:/recipe/" + savedCommand.getId() + "/show";
    }
}
