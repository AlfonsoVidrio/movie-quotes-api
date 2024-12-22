package com.challenges.movie_quotes.repository;

import com.challenges.movie_quotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("SELECT q FROM Quote q order by function('RANDOM') LIMIT 1")
    Quote getQuoteRandomly();
}