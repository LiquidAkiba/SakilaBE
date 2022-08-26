package com.example.demo.film;

import com.example.demo.filmActor.FilmActor;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="film")
public class Film {

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmID;


    @OneToMany(mappedBy = "film")
    Set<FilmActor> filmsActors;

    //Attributes
    private String title;
    private String description;
    private Integer releaseYear;
    private Integer rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    public Film(String title, String description, Integer release_year, Integer language_id, Integer rental_duration,
                BigDecimal rental_rate, Integer length, BigDecimal replacement_cost, String rating, String special_features) {
        this.title = title;
        this.description = description;
        this.releaseYear = release_year;
        this.rentalDuration = rental_duration;
        this.rentalRate = rental_rate;
        this.length = length;
        this.rating = rating;

    }


    //Empty Constructor
    public Film() {
    }

    public int getFilm_id() {
        return filmID;
    }

    public void setFilm_id(int filmid) {
        this.filmID = filmid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRelease_year() {
        return releaseYear;
    }

    public void setReleaseYear(Integer release_year) {
        this.releaseYear = release_year;
    }

    public Integer getRental_duration() {
        return rentalDuration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rentalDuration = rental_duration;
    }

    public BigDecimal getRental_rate() {
        return rentalRate;
    }

    public void setRental_rate(BigDecimal rental_rate) {
        this.rentalRate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getReplacement_cost() {
        return replacementCost;
    }

    public void setReplacement_cost(BigDecimal replacement_cost) {
        this.replacementCost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    
}