package com.udemy.spring.didemo.spring;

import com.udemy.spring.didemo.services.GreetingsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "default")
public class MyControllerDefaultProfileTest {

    @Autowired
    private GreetingsService greetingsService;

    @Test
    public void verifyGermanIsPrintedByDefault() {
        Assert.assertEquals("Hallo Welt!", greetingsService.saySomething());
    }

}
