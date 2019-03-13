package com.udemy.sfg.recipeapp.services.impl;

import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.repositories.RecipeRepository;
import com.udemy.sfg.recipeapp.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeDbServiceTest {

    @Mock
    private RecipeRepository recipeRepository;
    private RecipeService recipeService;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeDbService(recipeRepository);
    }

    @Test
    public void getAllRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> data = new HashSet<>();
        data.add(recipe);

        when(recipeRepository.findAll()).thenReturn(data);

        assertEquals(1, recipeService.getAllRecipes().size());

        verify(recipeRepository, times(1)).findAll();
    }
}