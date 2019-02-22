package com.udemy.spring.didemo.controllers;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private GreetingsService greetingsService;

    public ConstructorInjectionController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String say() {
        return greetingsService.saySomething();
    }

}
