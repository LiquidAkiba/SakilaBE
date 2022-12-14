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
    private double rentalRate;
    private Integer length;
    private double replacementCost;
    private String rating;

    //Empty Constructor

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmid) {
        this.filmID = filmid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalrate) {
        this.rentalRate = rentalrate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


}