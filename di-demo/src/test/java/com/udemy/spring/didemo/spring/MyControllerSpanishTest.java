package com.udemy.spring.didemo.spring;

import com.udemy.spring.didemo.services.GreetingsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "es")
public class MyControllerSpanishTest {

    @Autowired
    private GreetingsService greetingsService;

    @Test
    public void verifySpanishGreetingsPrinted() {
        Assert.assertEquals("Hola Mundo!", greetingsService.saySomething());
    }

}
