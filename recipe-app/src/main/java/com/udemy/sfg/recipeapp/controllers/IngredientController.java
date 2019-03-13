package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.commands.IngredientCommand;
import com.udemy.sfg.recipeapp.services.IngredientCommandService;
import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import com.udemy.sfg.recipeapp.services.UnitOfMeasureCommandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IngredientController {

    private final RecipeCommandService recipeCommandService;
    private final IngredientCommandService ingredientCommandService;
    private final UnitOfMeasureCommandService unitOfMeasureCommandService;

    public IngredientController(RecipeCommandService recipeCommandService,
                                IngredientCommandService ingredientCommandService,
                                UnitOfMeasureCommandService unitOfMeasureCommandService) {
        this.recipeCommandService = recipeCommandService;
        this.ingredientCommandService = ingredientCommandService;
        this.unitOfMeasureCommandService = unitOfMeasureCommandService;
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

    @GetMapping
    @RequestMapping("recipe/{recipeId}/ingredient/{ingredientId}/update")
    public String updateRecipeIngredient(@PathVariable Long recipeId,
                                         @PathVariable Long ingredientId,
                                         Model model) {
        model.addAttribute("uomList", unitOfMeasureCommandService.getAllUoms());
        model.addAttribute("ingredient", ingredientCommandService.findByRecipeIdAndIngredientId(recipeId, ingredientId));

        return "recipe/ingredient/ingredientform";
    }

    @PostMapping
    @RequestMapping("recipe/{recipeId}/ingredient")
    public String saveOrUpdate(@ModelAttribute IngredientCommand command){
        IngredientCommand savedCommand = ingredientCommandService.saveIngredientCommand(command);

        log.debug("saved receipe id:" + savedCommand.getRecipeId());
        log.debug("saved ingredient id:" + savedCommand.getId());

        return "redirect:/recipe/" + savedCommand.getRecipeId() + "/ingredient/" + savedCommand.getId() + "/show";
    }
}
