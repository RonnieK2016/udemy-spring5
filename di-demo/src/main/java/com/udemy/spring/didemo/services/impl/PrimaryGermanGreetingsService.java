package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;

public class PrimaryGermanGreetingsService  implements GreetingsService{
    @Override
    public String saySomething() {
        return "Hallo Welt!";
    }
}
