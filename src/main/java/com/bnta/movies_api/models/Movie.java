package com.bnta.movies_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//pojo
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String title;

    @Column
    private String rating;

    @Column
    //the data types in java are different to the data types in sequel = hibernate will convert this long to int in sql
    private long duration;


    public Movie(long id, String title, String rating, long duration) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Movie(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
