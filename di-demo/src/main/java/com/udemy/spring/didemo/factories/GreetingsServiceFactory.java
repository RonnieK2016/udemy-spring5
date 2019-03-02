package com.udemy.spring.didemo.factories;

import com.udemy.spring.didemo.services.GreetingsService;
import com.udemy.spring.didemo.services.impl.PrimaryGermanGreetingsService;
import com.udemy.spring.didemo.services.impl.PrimaryGreetingsService;
import com.udemy.spring.didemo.services.impl.PrimarySpanishGreetingsService;

public class GreetingsServiceFactory {

    public GreetingsService greetingsService(String lang) {
        switch (lang) {
            case "es": return new PrimarySpanishGreetingsService();
            case "de": return new PrimaryGermanGreetingsService();
            case "en": default:
                return new PrimaryGreetingsService();
        }
    }
}
