package com.udemy.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller(value = "HelloWorldController")
public class MyController {

    public void sayHello() {
        System.out.println("Hello!!!!");
    }

}
