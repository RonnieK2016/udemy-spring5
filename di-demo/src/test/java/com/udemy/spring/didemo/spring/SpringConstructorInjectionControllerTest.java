package com.udemy.spring.didemo.spring;

import com.udemy.spring.didemo.controllers.ConstructorInjectionController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringConstructorInjectionControllerTest {

    @Autowired
    ConstructorInjectionController constructorInjectionController;

    @Test
    public void verifyHelloWorldPrinted() {
        Assert.assertEquals("Howdy World!!!", constructorInjectionController.say());
    }
}
