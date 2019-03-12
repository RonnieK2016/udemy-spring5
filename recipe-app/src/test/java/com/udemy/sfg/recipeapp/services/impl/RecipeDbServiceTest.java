package com.udemy.sfg.recipeapp.services.impl;

import com.sun.org.apache.regexp.internal.RE;
import com.udemy.sfg.recipeapp.domain.Recipe;
import com.udemy.sfg.recipeapp.repositories.RecipeRepository;
import com.udemy.sfg.recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.sound.midi.Receiver;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeDbServiceTest {

    @Mock
    private RecipeRepository recipeRepository;
    private RecipeService recipeService;

    @Before
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