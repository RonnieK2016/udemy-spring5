package com.udemy.spring.didemo;

import com.udemy.spring.didemo.controllers.SetterInjectionController;
import com.udemy.spring.didemo.services.impl.HelloWorldGreetingsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;

    @Before
    public void setUp() {
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingsService(new HelloWorldGreetingsService());
    }

    @Test
    public void verifyHelloWorldPrinted() {
        Assert.assertEquals("Hello World!!!", setterInjectionController.say());
    }

}
