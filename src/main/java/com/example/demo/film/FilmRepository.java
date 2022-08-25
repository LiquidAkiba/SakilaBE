package com.example.demo.film;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film,Integer> {

    List<Film> findByTitle(String title);

    List<Film> findByFilmsActorsActorId(int id);


}
