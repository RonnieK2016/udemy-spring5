package com.example.udemy.spring5demowebapp.controllers;

import com.example.udemy.spring5demowebapp.model.repositories.BooksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

    private BooksRepository booksRepository;

    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @RequestMapping(path = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books", booksRepository.findAll());

        return "books";
    }
}
