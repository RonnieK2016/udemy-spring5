package com.udemy.sfg.recipeapp.controllers;

import com.udemy.sfg.recipeapp.domain.Category;
import com.udemy.sfg.recipeapp.domain.UnitOfMeasure;
import com.udemy.sfg.recipeapp.repositories.CategoryRepository;
import com.udemy.sfg.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexPageController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexPageController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {

        Optional<Category> category = categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Pinch");

        System.out.println("Category ID: " + category.get().getId());
        System.out.println("UOM ID: " + unitOfMeasure.get().getId());

        return "index";
    }
}
