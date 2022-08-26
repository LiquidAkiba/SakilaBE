package com.example.demo.film;

import com.example.demo.actor.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void getFilmID() {

        Film testFilm = new Film();
        testFilm.setFilmID(12);
        assertEquals(12, testFilm.getFilmID());
    }

    @Test
    void setFilmID() {
        Film testFilm = new Film();
        testFilm.setFilmID(1);
        assertEquals(1, testFilm.getFilmID());
    }

    @Test
    void getTitle() {
        Film testRating = new Film();
        testRating.setTitle("Rush");
        assertEquals("Rush", testRating.getTitle());
    }

    @Test
    void setTitle() {
        Film testRating = new Film();
        testRating.setTitle("Rush");
        assertEquals("Rush", testRating.getTitle());
    }

    @Test
    void getReplacementCost(){
        Film testRating = new Film();
        testRating.setReplacementCost(20.99);
        assertEquals(20.99, testRating.getReplacementCost());
    }

    @Test
    void setReplacementCost(){
        Film testRating = new Film();
        testRating.setReplacementCost(20.99);
        assertEquals(20.99, testRating.getReplacementCost());

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