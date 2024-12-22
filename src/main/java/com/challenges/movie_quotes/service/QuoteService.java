package com.challenges.movie_quotes.service;

import com.challenges.movie_quotes.dto.QuoteDTO;
import com.challenges.movie_quotes.model.Quote;
import com.challenges.movie_quotes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository repository;
    public QuoteDTO getQuoteRandomly() {
        Quote quote = repository.getQuoteRandomly();
        return new QuoteDTO(quote.getTitle(),quote.getQuote(),quote.getAuthor(),quote.getPoster());
    }
}
