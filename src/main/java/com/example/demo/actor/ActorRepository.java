package com.example.demo.actor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor,Integer> {

    List<Actor> findByFirstName(String firstName);
    Actor getActorByFirstNameAndLastName(String firstName, String lastName);
    Actor getActorById(int actorId);
}