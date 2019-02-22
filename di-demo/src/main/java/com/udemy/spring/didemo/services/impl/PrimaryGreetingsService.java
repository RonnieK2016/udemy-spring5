package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingsService implements GreetingsService {
    @Override
    public String saySomething() {
        return "Hello from PrimaryGreetingsService!!!";
    }
}
