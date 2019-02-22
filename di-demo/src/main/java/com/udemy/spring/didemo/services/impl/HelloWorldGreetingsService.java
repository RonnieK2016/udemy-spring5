package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;

public class HelloWorldGreetingsService implements GreetingsService {

    @Override
    public String saySomething() {
        return "Hello World!!!";
    }
}
