package com.udemy.sfg.jokesapp.services.impl;

import com.udemy.sfg.jokesapp.services.JokesService;
import com.udemy.sfg.jokes.ComputerJokesSource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("computer")
public class ComputerJokesService implements JokesService {

    private final ComputerJokesSource computerJokesSource;

    public ComputerJokesService() {
        this.computerJokesSource = new ComputerJokesSource();
    }


    @Override
    public String getJoke() {
        return computerJokesSource.getRandomQuote();
    }
}
