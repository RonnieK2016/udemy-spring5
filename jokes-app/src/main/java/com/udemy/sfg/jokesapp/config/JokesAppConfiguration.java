package com.udemy.sfg.jokesapp.config;

import com.udemy.sfg.jokes.ComputerJokesSource;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokesAppConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

    @Bean
    public ComputerJokesSource computerJokesSource() {
        return new ComputerJokesSource();
    }

}
