package com.udemy.spring.didemo.config;

import com.udemy.spring.didemo.factories.GreetingsServiceFactory;
import com.udemy.spring.didemo.services.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

    @Bean
    public GreetingsServiceFactory greetingsServiceFactory() {
        return new GreetingsServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    public GreetingsService greetingsServiceEn(GreetingsServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.greetingsService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    public GreetingsService greetingsServiceDe(GreetingsServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.greetingsService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingsService greetingsServiceEs(GreetingsServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.greetingsService("es");
    }

}
