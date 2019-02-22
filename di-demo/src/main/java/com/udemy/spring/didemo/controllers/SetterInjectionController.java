package com.udemy.spring.didemo.controllers;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingsService greetingsService;

    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String say() {
        return greetingsService.saySomething();
    }

}
