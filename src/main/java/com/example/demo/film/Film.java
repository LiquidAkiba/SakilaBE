package com.example.demo.film;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="film")
public class Film {

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmID;



    //Attributes
    private String title;
    private Integer rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;

    //Empty Constructor

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