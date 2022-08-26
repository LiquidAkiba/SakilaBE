package com.example.demo.film;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void getFilm_id() {
    }

    @Test
    void setFilm_id() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
    }

    @Test
    void getRelease_year() {
    }

    @Test
    void setReleaseYear() {
    }

    @Test
    void getLanguage_id() {
    }

    @Test
    void setOriginal_language_id() {
    }

    @Test
    void getRental_duration() {
    }

    @Test
    void setRental_duration() {
    }

    @Test
    void getRental_rate() {
    }

    @Test
    void setRental_rate() {
    }

    @Test
    void getLength() {
        Film testLength  = new Film();
        testLength.setLength(69);
        assertEquals(69, testLength.getLength());
    }

    @Test
    void setLength() {
    }

    @Test
    void getReplacement_cost() {
    }

    @Test
    void setReplacement_cost() {
    }

    @Test
    void getRating() {
        Film testRating = new Film();
        testRating.setRating("2");
        assertEquals("2", testRating.getRating());
    }

    @Test
    void setRating() {
    }

    @Test
    void getSpecial_features() {
    }

    @Test
    void setSpecial_features() {
    }
}