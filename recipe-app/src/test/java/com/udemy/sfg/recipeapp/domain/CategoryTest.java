package com.udemy.sfg.recipeapp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

    private Category category;

    @Before
    public void createCategory() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 1L;
        category.setId(id);
        Assert.assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}