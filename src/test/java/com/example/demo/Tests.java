package com.example.demo;

import com.example.demo.actor.Actor;
import com.example.demo.category.Category;
import com.example.demo.film.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void test_getFirstName(){

        Actor testActor = new Actor();
        testActor.setFirstName("Gary");
        assertEquals("Gary", testActor.getFirstName(), "The name is not a match");
    }

    @Test
    void test_GetLastName(){
        Actor testActor = new Actor();
        testActor.setLastName("Oldman");
        assertEquals("Oldman", testActor.getLastName(), "The name is not a match");
    }

    void test_GetCategoryName(){
        Category testCategory = new Category();
        testCategory.setName("RomCom");
        assertEquals("RomCom", testCategory.getName(), "The category did not match");
    }

    void test_GetRating() {
        Film testRating = new Film();
        testRating.setRating("2");
        assertEquals("2", testRating.getRating());
    }

    void test_GetLength(){
        Film testLength  = new Film();
        testLength.setLength(69);
        assertEquals(69, testLength.getLength());
    }

}
