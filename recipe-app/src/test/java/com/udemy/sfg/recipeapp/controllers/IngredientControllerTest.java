package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.commands.IngredientCommand;
import com.udemy.sfg.recipeapp.commands.RecipeCommand;
import com.udemy.sfg.recipeapp.services.IngredientCommandService;
import com.udemy.sfg.recipeapp.services.RecipeCommandService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class IngredientControllerTest {

    @Mock
    private RecipeCommandService recipeCommandService;
    @Mock
    private IngredientCommandService ingredientCommandService;

    private IngredientController ingredientController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        ingredientController = new IngredientController(recipeCommandService, ingredientCommandService);
        mockMvc = MockMvcBuilders.standaloneSetup(ingredientController).build();
    }

    @Test
    void listIngredients() throws Exception {

        when(recipeCommandService.findRecipeCommandById(anyLong())).thenReturn(new RecipeCommand());

        mockMvc.perform(get("/recipe/1/ingredients"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/list"))
                .andExpect(model().attributeExists("recipe"));

        verify(recipeCommandService).findRecipeCommandById(anyLong());
    }

    @Test
    void viewIngredientById() throws Exception {
        when(ingredientCommandService.findByRecipeIdAndIngredientId(anyLong(), anyLong())).thenReturn(new IngredientCommand());

        mockMvc.perform(get("/recipe/1/ingredient/2/show"))
                .andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/show"))
                .andExpect(model().attributeExists("ingredient"));
        verify(ingredientCommandService).findByRecipeIdAndIngredientId(anyLong(), anyLong());
    }
}