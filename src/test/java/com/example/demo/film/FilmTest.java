package com.example.demo.film;

import com.example.demo.actor.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void getTitle() {
        Film testRating = new Film();
        testRating.setTitle("Rush");
        assertEquals("Rush", testRating.getTitle());
    }

    @Test
    void setTitle() {
    }

    @Test
    void getDescription() {

        Film testRating = new Film();
        testRating.setDescription("Forumla 1 Movie");
        assertEquals("Forumla 1 Movie", testRating.getDescription());
    }

    @Test
    void setDescription() {
    }

    @Test
    void getRelease_year() {
        Film testRating = new Film();
        testRating.setRelease_year(2020);
        assertEquals(2020, testRating.getRelease_year());
    }

    @Test
    void setReleaseYear() {
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
        testLength.setLength(129);
        assertEquals(129, testLength.getLength());
    }

    @Test
    void setLength() {
        Film testLength  = new Film();
        testLength.setLength(129);
        assertEquals(129, testLength.getLength());
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