package com.example.demo.category;

import com.example.demo.actor.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void getCategoryId() {

        Category testCategory = new Category();
        testCategory.setCategoryId(23);
        assertEquals(23, testCategory.getCategoryId());
    }

    @Test
    void setCategoryId() {
        Category testCategory = new Category();
        testCategory.setCategoryId(23);
        assertEquals(23, testCategory.getCategoryId());
    }

    @Test
    void getName() {
        Category testCategory = new Category();
        testCategory.setName("RomCom");
        assertEquals("RomCom", testCategory.getName(), "The category did not match");
    }

    @Test
    void setName() {
        Category testCategory = new Category();
        testCategory.setName("RomCom");
        assertEquals("RomCom", testCategory.getName(), "The category did not match");
    }
}