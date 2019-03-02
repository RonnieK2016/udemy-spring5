package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;

public class PrimaryGreetingsService implements GreetingsService {
    @Override
    public String saySomething() {
        return "Hello from PrimaryGreetingsService!!!";
    }
}
