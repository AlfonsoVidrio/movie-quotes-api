package com.challenges.movie_quotes.controller;

import com.challenges.movie_quotes.dto.QuoteDTO;
import com.challenges.movie_quotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    @Autowired
    private QuoteService service;

    @GetMapping("/series/quotes")
    public QuoteDTO obtenerFrases(){
        return service.getQuoteRandomly();
    }

}
