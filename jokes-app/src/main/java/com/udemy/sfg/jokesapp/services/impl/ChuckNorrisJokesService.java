package com.udemy.sfg.jokesapp.services.impl;

import com.udemy.sfg.jokesapp.services.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("chucknorris")
public class ChuckNorrisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
