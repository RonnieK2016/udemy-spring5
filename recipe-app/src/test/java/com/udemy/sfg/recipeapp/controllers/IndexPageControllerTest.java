package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

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
        assertEquals("index", indexPageController.getIndexPage(model));
        verify(model, times(1)).addAttribute("recipes", anySet());
        verify(recipeService, times(1)).getAllRecipes();
    }
}