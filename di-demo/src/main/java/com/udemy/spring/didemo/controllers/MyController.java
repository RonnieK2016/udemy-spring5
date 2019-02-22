package com.udemy.spring.didemo.controllers;

import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller(value = "HelloWorldController")
public class MyController {

    private GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayHello() {
        System.out.println(greetingsService.saySomething());
    }

}
