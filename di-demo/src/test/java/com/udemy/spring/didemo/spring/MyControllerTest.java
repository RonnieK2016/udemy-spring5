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
@ActiveProfiles(profiles = "default")
@RunWith(SpringRunner.class)
public class MyControllerTest {

    @Autowired
    private GreetingsService greetingsService;

    @Test
    public void testPrimaryGreetingsIsPrinted() {
        Assert.assertEquals("Hello from PrimaryGreetingsService!!!", greetingsService.saySomething());
    }

}
