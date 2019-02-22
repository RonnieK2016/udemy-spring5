package com.udemy.spring.didemo.services.impl;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"})
public class PrimaryGermanGreetingsService  implements GreetingsService{
    @Override
    public String saySomething() {
        return "Hallo Welt!";
    }
}
