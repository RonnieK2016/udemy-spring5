package com.udemy.spring.didemo.controllers;

import com.udemy.spring.didemo.services.GreetingsService;

public class PropertyInjectionController {

    public GreetingsService greetingsService;

    public String say() {
        return greetingsService.saySomething();
    }

}
