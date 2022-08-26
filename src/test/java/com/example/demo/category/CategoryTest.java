package com.example.demo.category;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void getCategoryId() {
    }

    @Test
    void setCategoryId() {
    }

    @Test
    void getName() {
        Category testCategory = new Category();
        testCategory.setName("RomCom");
        assertEquals("RomCom", testCategory.getName(), "The category did not match");
    }

    @Test
    void setName() {
    }
}