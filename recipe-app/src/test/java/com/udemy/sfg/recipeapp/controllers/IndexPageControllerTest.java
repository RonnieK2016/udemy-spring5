package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

public class IndexPageControllerTest {

    @Mock
    private RecipeService recipeService;
    @Mock
    private Model model;
    private IndexPageController indexPageController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexPageController = new IndexPageController(recipeService);
    }

    @Test
    public void getIndexPage() {
        //given
        Set<Recipe> recipes = new HashSet<>();
        Recipe recipe = new Recipe();
        Recipe recipe1 = new Recipe();
        recipe.setId(1L);
        recipes.add(recipe);
        recipes.add(recipe1);

        //when
        when(recipeService.getAllRecipes()).thenReturn(recipes);

        assertEquals("index", indexPageController.getIndexPage(model));

        ArgumentCaptor<Set<Recipe>> setArgumentCaptor  = ArgumentCaptor.forClass(Set.class);

        verify(model, times(1)).addAttribute(eq("recipes"), setArgumentCaptor.capture());
        verify(recipeService, times(1)).getAllRecipes();

        assertEquals(2, setArgumentCaptor.getValue().size());
    }
}