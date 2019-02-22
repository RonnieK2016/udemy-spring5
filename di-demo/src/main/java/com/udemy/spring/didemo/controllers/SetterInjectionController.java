package com.udemy.spring.didemo.controllers;

import com.udemy.spring.didemo.services.GreetingsService;

public class SetterInjectionController {

    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String say() {
        return greetingsService.saySomething();
    }

}
