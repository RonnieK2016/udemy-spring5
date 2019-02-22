package com.udemy.spring.didemo;

import com.udemy.spring.didemo.controllers.ConstructorInjectionController;
import com.udemy.spring.didemo.services.impl.HelloWorldGreetingsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new HelloWorldGreetingsService());
    }

    @Test
    public void verifyHelloWorldPrinted() {
        Assert.assertEquals("Hello World!!!", constructorInjectionController.say());
    }

}
