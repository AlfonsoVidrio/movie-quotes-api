package com.challenges.movie_quotes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;  // Cambié a minúscula
    private String quote;  // Cambié a minúscula
    private String author; // Cambié a minúscula
    private String poster;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getPoster() {
        return poster;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "title='" + title + '\'' +
                ", quote='" + quote + '\'' +
                ", author='" + author + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
