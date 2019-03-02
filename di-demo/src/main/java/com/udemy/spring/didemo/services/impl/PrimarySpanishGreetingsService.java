package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;

public class PrimarySpanishGreetingsService implements GreetingsService {
    @Override
    public String saySomething() {
        return "Hola Mundo!";
    }
}
