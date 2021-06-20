package com.example.spring5jokesappv2.controller.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JockServiceImpl implements JockService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JockServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String nextJock() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
