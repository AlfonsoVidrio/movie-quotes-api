# Movie Quotes API

A simple Spring Boot API that provides random quotes from movie and TV show characters.

## Features

- **Get random quotes**: The API returns a random quote from a movie or TV show character.
- **Cross-Origin Resource Sharing (CORS)** support is configured to allow requests from `http://127.0.0.1:5500`.

## API Endpoints

### `GET /series/quotes`

Fetches a random quote from a movie or TV show character.

#### Response (Example)

```json
{
  "title": "The Dark Knight",
  "quote": "Why so serious?",
  "character": "Joker",
  "poster": "http://path_to_image.jpg"
}
```

## Technologies Used

- **Spring Boot**: Framework used for building the backend API.
- **Spring Data JPA**: JPA (Java Persistence API) is used to interact with the PostgreSQL database. Spring Data JPA simplifies database access by handling common operations like saving, retrieving, and updating data with minimal code.
- **PostgreSQL**: Database used for storing movie and TV show quotes. It is a powerful, open-source relational database that the application uses to persist data.

## Running the Application

### Prerequisites

- JDK 17 or later
- PostgreSQL database running
- Maven or Gradle for dependency management
