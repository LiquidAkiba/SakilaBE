package com.example.demo.filmActor;


import com.example.demo.actor.Actor;
import com.example.demo.film.Film;

import javax.persistence.*;

@Entity
@Table(name="film_actor")
public class FilmActor {

    @EmbeddedId
    FilmActorKey id;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    Film film;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    Actor actor;


    public FilmActor() {

    }
}

