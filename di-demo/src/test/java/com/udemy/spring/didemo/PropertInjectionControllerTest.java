package com.udemy.spring.didemo;

import com.udemy.spring.didemo.controllers.PropertyInjectionController;
import com.udemy.spring.didemo.services.impl.HelloWorldGreetingsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class PropertInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingsService = new HelloWorldGreetingsService();
    }

    @Test
    public void verifyHelloWorldPrinted() {
        Assert.assertEquals("Hello World!!!", propertyInjectionController.say());
    }

}
