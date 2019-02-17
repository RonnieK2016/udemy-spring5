package com.example.udemy.spring5demowebapp.model.repositories;

import com.example.udemy.spring5demowebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book, Long> {
}
