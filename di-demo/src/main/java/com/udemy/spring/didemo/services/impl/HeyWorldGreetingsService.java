package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.stereotype.Service;

@Service
public class HeyWorldGreetingsService implements GreetingsService {

    @Override
    public String saySomething() {
        return "Hey World!!!";
    }
}
