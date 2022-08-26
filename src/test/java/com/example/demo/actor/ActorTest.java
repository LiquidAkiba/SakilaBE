package com.example.demo.actor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    void getId() {

        Actor testActor = new Actor();
        testActor.setId = (12);
        assertEquals(12, testActor.getId());
    }

    @Test
    void setId() {
    }

    @Test
    void getFirstName() {

        Actor testActor = new Actor();
        testActor.setFirstName("Gary");
        assertEquals("Gary", testActor.getFirstName(), "The name is not a match");
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
        Actor testActor = new Actor();
        testActor.setLastName("Oldman");
        assertEquals("Oldman", testActor.getLastName(), "The name is not a match");
    }

    @Test
    void setLastName() {
    }
}