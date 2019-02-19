package com.example.udemy.spring5demowebapp.controllers;

import com.example.udemy.spring5demowebapp.model.repositories.AuthorsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorsController {

    private AuthorsRepository authorsRepository;

    public AuthorsController(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @RequestMapping(path = "authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorsRepository.findAll());

        return "authors";
    }
}
