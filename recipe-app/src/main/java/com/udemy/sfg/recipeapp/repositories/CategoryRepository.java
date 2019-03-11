package com.udemy.sfg.recipeapp.repositories;

import com.udemy.sfg.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
