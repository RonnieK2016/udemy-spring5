package com.example.udemy.spring5demowebapp.model.repositories;

import com.example.udemy.spring5demowebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Long, Author> {
}
